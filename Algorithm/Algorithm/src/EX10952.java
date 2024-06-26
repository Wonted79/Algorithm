import java.io.*;
import java.util.StringTokenizer;

public class EX10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       while (true){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
           if (a==0&&b==0){
               break;
           }
            bw.write(a+b+"\n");
        }
        bw.close();
    }
}
