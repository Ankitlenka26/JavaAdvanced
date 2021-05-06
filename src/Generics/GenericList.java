package Generics;

public class GenericList <T> { // represents the type of objets that we want to store in the list
    private T[] items = (T[])new Object[10];
    private int count;
    public void add(T item){
        items[count] = item;
        count++;
    }
    public T get(int index){
        return items[index];
    }
}
