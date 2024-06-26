import javax.imageio.IIOException;
import java.io.*;
import java.util.StringTokenizer;

public class EX11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bufferedReader.readLine());
        for(int i=1;i<=T;i++){
            StringTokenizer st= new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;
            bufferedWriter.write( "Case #"+i+": "+a+" + "+b+" = "+sum+"\n");
        }
        bufferedWriter.close();
    }
}
