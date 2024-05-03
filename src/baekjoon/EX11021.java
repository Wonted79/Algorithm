package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class EX11021{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum ;
        for (int i=1;i<=num;i++)
        {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum = a+b;
            //BufferReader 처럼 BufferWriter또한 문자열의 형태로 출력되어야 하기때문에 정수형으로 write()를 쓰는 경우 오류가 생기는것 같다.
            //따라서 문자열로 바꾸어 준 뒤 출력하자.
            String st_i = Integer.toString(i);
            String st_sum= Integer.toString(sum);
            String result = "Case #"+st_i+": "+st_sum;
            bw.write(result);
            bw.newLine();
        }
        bw.close();
    }
}

