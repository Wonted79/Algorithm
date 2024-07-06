import java.io.*;
import java.util.StringTokenizer;

public class EX10810 {
    /*
    바구니배열을 먼저 만드는데 첫줄입력 N
     그리고 몇번의 입력을 받을지 for문을 돌림
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String NM = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(NM);
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        //바구니 만들기
        int basket[] = new int[N];
        //M 번 입력 받기
        for (int n=0;n<M;n++){
            //범위 i,j 값 k 받기
            String ijk = br.readLine();
            StringTokenizer ijkTokenizer = new StringTokenizer(ijk);
            int i = Integer.parseInt(ijkTokenizer.nextToken());
            int j = Integer.parseInt(ijkTokenizer.nextToken());
            int k = Integer.parseInt(ijkTokenizer.nextToken());
            //배열에 적용하기
            for(int m=i;m<=j;m++){
                basket[m-1]=k;
            }
        }
        //출력하는 함수 만들기
        for (int l=0;l<N;l++){
            bw.write(basket[l]+" ");
        }
        bw.close();
    }
    }
