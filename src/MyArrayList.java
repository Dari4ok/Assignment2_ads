
public class MyArrayList<T> implements MyList<T>{
    private T[] arr = (T[]) new Object[5];
    private int size;


    public MyArrayList() {
        size = 0;
    }


    @Override
    public void addElement(T element) {
        if (size == arr.length) {
            increaseList();
        }
        arr[size] = element;
        size += 1;
    }

    @Override
    public void setElement(int index, T element) {
        checkIndex(index);
        arr[index] = element;
    }

    @Override
    public void addElement(int index, T element) {
        checkIndex(index);


    }

    @Override
    public void addFirst(T element) {

    }

    @Override
    public void addLast(T element) {

    }

    @Override
    public T getElement(int i) {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T removeElement(int index) {
        return null;
    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void getIndex(T element) {

    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void pop(int index) {

    }

    private void increaseList(){
        T[] newArr = (T[]) new Object[arr.length*2];

        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    private void checkIndex(int index){
        if ( index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not correct");
        }
    }

}
