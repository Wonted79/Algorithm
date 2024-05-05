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
        if (count >=arraySize) {
            System.out.println("Array is full");
        }
        intArray[position] = element;
        count +=1;
    }
    public int removeElement(int position){
        //잘못된 position을 입력하였을때
        if(position<0 || position>=arraySize){
            System.out.println("Error : out of index");
        }
        //배열에 담기지 않은 위치의 값을 삭제하려 할때
        if(intArray[position] == 0 ){
            System.out.println("Error : Can not found position"+position);
        }
        int temp  = intArray[position];
        intArray[position] = 0;
        return temp;
    }
    public int getSize(){
        return count;
    }
    public boolean isEmpty(){
        if(count == 0 ){
            return true;
        }
       else{
           return false;
        }
    }
    public int getElement(int position){
        int element  =intArray[position];
        if(element == 0){
            System.out.println("Null Error");
        }
        return element;}
    public void printAll(){
        for(int elements:intArray){
            System.out.println(elements);
        }
    }
    public void removeAll(){
        for(int i=0;i<count;i++){
            intArray[i] =0;
        }
        count = 0;
        System.out.println("array all removed");
    }
}

