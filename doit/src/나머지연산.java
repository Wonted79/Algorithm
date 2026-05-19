public class 나머지연산 {
    public static void main(String[] args) {
        //1*50까지 곱한 값을 10007 로 나눈 나머지 구하기
        // (a*b)%c  == (a%c) * (b%c) %c
        long answer =1;
        for (int i=1 ; i<=50 ; i++){
            answer = (answer*i)%10007;
        }
        System.out.println(answer);
        System.out.println(answer%10007);
    }
}
