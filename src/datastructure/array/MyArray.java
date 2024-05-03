package datastructure.array;

public class MyArray {
    int intArray[];
    int arraySize;
    int count;

    public MyArray() {
        //기본 생성자로 객체 생성시 size는 10
        count = 0;
        arraySize = 10;
        intArray = new int[arraySize];
    }
    public MyArray(int size) {
        //기본 생성자로 객체 생성시 size는 10
        count = 0;
        arraySize = size;
        intArray = new int[arraySize];
    }

    public void addElement(int element) {
        //배열이 가득차면
        if (count >=arraySize){
            System.out.println("Array is full");
        }
        else{
            //후위연산자이므로 count 의 값을 사용하고 나서 +1 을 해주는 형태
            intArray[count++]=element;
        }
    }


    public void insertElement(int position, int element){
        //잘못된 position을 입력하였을때 , 배열에 빈공간을 허용함 , 빈공간은 0으로 초기화
        if(position<0 || position>=arraySize) {
            System.out.println("Error : out of index");
        }
        //배열이 꽉 찼을때
        else if (count >=arraySize) {
            System.out.println("Array is full");
        }
        else{
            intArray[position] = element;
            count +=1;
        }
    }
    public int removeElement(int position){return 0;}
    public int getSize(){return 0;}
    public boolean isEmpty(){return true;}
    public int getElement(int position){return 0;}
    public void printAll(){
        for(int elements:intArray){
            System.out.println(elements);
        }
    }
    public void removeAll(){}
}

