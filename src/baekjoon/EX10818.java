package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//최대값,최소값 구하기
public class EX10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max =0;
        int min =1000000;
        int num = Integer.parseInt(br.readLine());
        int[] numList = new int[num];
        //반복문으로 입력한값 배열에 채우기
        String nums = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(nums," ");
        for(int i=0;i<num;i++){
            numList[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        //배열을 순회하며 최소,최대값 저장하기
        for(int i=0;i<num;i++){
            if (numList[i]>max){
                max =  numList[i];
            }
        }
        for(int i=0;i<num;i++){
            if (numList[i]<min){
                min =  numList[i];
            }
        }
        String strMax = Integer.toString(max);
        String strMin = Integer.toString(min);
        bw.write(strMin+" "+strMax);
        bw.close();
    }
}
