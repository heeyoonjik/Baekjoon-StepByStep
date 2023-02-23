import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0, iIndex = 1, jIndex = 1;
        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num>max){
                    max = num;
                    iIndex = i+1;
                    jIndex = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(iIndex+" "+jIndex);

    }
}