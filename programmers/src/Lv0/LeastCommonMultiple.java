package Lv0;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        int a = 24;
        int b = 18;

        int result = a*b/GCD(a,b);
        System.out.println(result);
    }
    private static int GCD(int a, int b){
        while (b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
