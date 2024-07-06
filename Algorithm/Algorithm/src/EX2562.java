import java.io.*;

public class EX2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numbers[] = new int[9];
        int max = 0;
        int temp =0;
        for(int i=0;i<9;i++){
            numbers[i]= Integer.parseInt(br.readLine());
        }
        for(int j=0;j<9;j++){
            if(numbers[j]>max){
                max = numbers[j];
                temp = j+1;
            }
        }
        bw.write(max + "\n");
        bw.write(Integer.toString(temp));
        bw.close();
    }
}
