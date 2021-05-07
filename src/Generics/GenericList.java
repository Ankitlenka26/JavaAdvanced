package Generics;

import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{
    private T[] items = (T[])new Object[10];
    private int count;
    public void add(T item){
        items[count] = item;
        count++;
    }
    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    // If in future we change the implementation of the list this class is the only class where we have to make any changes
    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index;
        public ListIterator(GenericList<T> list){
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }
        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
