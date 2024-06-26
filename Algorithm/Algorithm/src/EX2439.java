import java.io.*;
public class EX2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++) {
                bw.write(" ");
            }
            for(int j=1;j<=i;j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}

/*
이 방법도 나쁘지 않은것 같음
if(j>t-i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
 */