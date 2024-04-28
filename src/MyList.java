public interface MyList<T> {
    void addElement(T element);
    void setElement(int index, T element);
    void addElement(int index, T element);
    void addFirst(T element);
    void addLast(T element);
    T getElement(int i);
    T getFirst();
    T getLast();
    T removeElement(int index);
    void removeFirst();
    void removeLast();
    void getIndex(T element);
    T[] toArray();
    void clear();
    void sort();
    int getSize();
    void pop(int index);
}
