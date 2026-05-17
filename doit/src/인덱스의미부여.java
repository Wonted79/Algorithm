import java.io.*;
import java.util.StringTokenizer;

public class 인덱스의미부여 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        //해당인덱스에 입력된 숫자의 수만큼 카운트를 올려놓는다 -> 인덱스의 수가 몇개라는뜻
        for (int i =0;i<N;i++){
            int number = Integer.parseInt(st.nextToken());
            count[number]++;
        }
        br.close();
        //인덱스의 있는 수만큼 반복문으로 출력한다.
        for (int i=0;i<=1000;i++){
            if(count[i] !=0){
                for(int j=0; j<count[i]; j++){
                    bw.write(i+" ");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
