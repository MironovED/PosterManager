package ru.netology.manager;


public class PosterManager {
    private Film[] items = new Film[0];

    public void save(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] findAll() {
        return items;
    }


    private int limit = 10;

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public Film[] getAll() {
        int resultLength;
        if (limit == 10) {
            resultLength = 10;
        } else {
            resultLength = limit;
        }
        Film[] items = findAll();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


}



