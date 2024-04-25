public interface MyList<T> {
    void addElement(T element);
    void addElement(int index, T element);
    T getElement(int i);
    int size = 0;
    void removeElement(int index);
}
