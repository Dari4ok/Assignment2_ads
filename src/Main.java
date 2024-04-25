public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.addElement(15);
        myArrayList.addElement(10);
        myArrayList.addElement(25);
        myArrayList.addElement(30);
        myArrayList.addElement(3,1);
        myArrayList.removeElement(4);

        System.out.println("Get element i = 3: " + myArrayList.getElement(3));
        System.out.println("Get first element: "+ myArrayList.getFirst());
        System.out.println("Get last element: " + myArrayList.getLast());
        System.out.println("Get first index element = 10: " + myArrayList.getFirstIndex(10));
        myArrayList.removeElement(4);
        System.out.println("Get last element: " + myArrayList.getLast());
    }
}