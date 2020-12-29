package project16;

import java.util.ArrayList;

public class simplequeue<T> implements queue<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
    	list.add(item);
    }

    public T remove() {
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}