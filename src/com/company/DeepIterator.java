package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

class DeepIterator implements Iterator<String> {
    private Iterator subIterator;
    private DeepIterator newIterator;

    public DeepIterator(Iterator<?> iniIter) {
        this.subIterator = iniIter;
    }

    @Override
    public boolean hasNext() {
        if (subIterator.hasNext()) return true;
        if (newIterator != null) return newIterator.hasNext();
        return false;

    }

    @Override
    public String next() {
        if(!hasNext())
            throw new NoSuchElementException();

        Object obj = null;
        if (newIterator != null && newIterator.hasNext()) obj = newIterator.next();

        if (subIterator.hasNext() && obj == null) {
            obj = subIterator.next();

            if (obj instanceof Iterator && ((Iterator) obj).hasNext()) {
                newIterator = new DeepIterator((Iterator) obj);

            }
        }

        if(obj instanceof Iterator){
            obj = next();
        }

        return (String) obj;
    }
}
