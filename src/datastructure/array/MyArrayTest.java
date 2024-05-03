package datastructure.array;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.addElement(1);
        myArray.addElement(2);
        myArray.insertElement(4, 4);
        myArray.insertElement(5, 4);
        myArray.insertElement(-1, 4);
        myArray.printAll();
    }
}
