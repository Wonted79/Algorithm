package Lv0;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        System.out.println(solution(num1,num2));
        System.out.println(solution1(num1,num2));
    }
    public static int solution(int num1, int num2) {
        double answer = (double)num1/num2*1000;
        int result = (int)answer;
        return result;
    }

    public static int solution1(int num1, int num2) {
        double doubleNum1 = num1;
        double doubleNum2 = num2;
        int answer = (int)(doubleNum1/doubleNum2*1000);
        return answer;
    }
}
