package Lv0;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 24;
        int b = 18;
        int r ;
        while (b!=0){
            r= a%b;
            a=b;
            b=r;
        }
        int result = a;
        System.out.println(result);
    }
}
