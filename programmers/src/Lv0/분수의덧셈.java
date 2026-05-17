package Lv0;

public class 분수의덧셈 {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        print(solution(numer1, denom1 , numer2,denom2));
    }

    //정석적으로 분수로 풀기
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        //denom을 공배수로 만들고 공배수가 되기 위한 만큼의값을 분자에 곱해서 분자를 더한다.
        int CommonMultiple = denom1 * denom2;
        numer1*=denom2;
        numer2*=denom1;
        int sumNumers = numer1 + numer2;
        //그리고 기약분수로 만든다.
        int gcdNum = GCD(sumNumers, CommonMultiple);
        answer[0] = sumNumers/gcdNum;
        answer[1] = CommonMultiple/gcdNum;
        return answer;
    }

    private static int GCD(int a ,int b){
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private static void print(int[] arr){
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}
