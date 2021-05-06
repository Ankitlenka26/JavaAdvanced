package Generics;

public class List {
    private int[] items = new int[10];
    private int count;
    public void add(int item){
        items[count] = item;
        count++;
    }

    public int get(int index){
        return items[index];
    }
}
