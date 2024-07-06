import java.io.*;

public class EX10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력갯수
        int num = Integer.parseInt(br.readLine());
        //입력 정수배열
        String nums []= br.readLine().split(" ");
        int numbers[] =new int[num];
        for (int i =0;i<num;i++){
            numbers[i] = Integer.parseInt(nums[i]);
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int j =0;j<num;j++) {
            if (numbers[j]>max){
                max = numbers[j];
            }
            if (numbers[j]<min){
                min = numbers[j];
            }
        }
        bw.write(Integer.toString(min));
        bw.write(" ");
        bw.write(Integer.toString(max));
        bw.close();
    }
}
