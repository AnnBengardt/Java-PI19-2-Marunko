package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleArrayIterator<T> implements Iterator<T> {
    private T[][] array;
    private int index_1 = 0;
    private int index_2 = 0;

    public DoubleArrayIterator(T[][] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        if (index_2 >= array[index_1].length) {
            index_2 = 0;
            index_1++;
        }
        return index_1 < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()){
                throw new NoSuchElementException();
            }
        return array[index_1][index_2++];
    }
}