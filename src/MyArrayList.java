public class MyArrayList<T> implements MyList<T>{
    private T[] arr = (T[]) new Object[5];
    private int size;

    public MyArrayList() {
        size = 0;
    }

    public void addElement(T element) {
        if (size == arr.length) {
            increaseList();
        }
        arr[size] = element;
        size++;
    }


    public void addElement(int index, T element) {
        checkIndex(index);
        if (size == arr.length) {
            increaseList();
        }
        arr[index] = element;
    }


    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void removeElement(int index) {
        checkIndex(index);
        T[] Temp = (T[]) new Object[size - 1];
        for (int i = index; i < size - 1; i++) {
            if (i != index) {
                Temp[i] = arr[i];
            }
            else{
                i--;
            }
        }
    }

    public T getFirst(){
        checkIndex(0);
        return arr[0];
    }

    public T getLast(){
        checkIndex(size - 1);
        return arr[size - 1];
    }

    public int getFirstIndex(T element){
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
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
