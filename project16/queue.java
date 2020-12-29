package project16;

public interface queue<T> {
    void add(T item);
    T remove();
    boolean isEmpty();
}