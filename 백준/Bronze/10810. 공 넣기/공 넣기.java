import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int [Integer.parseInt(st.nextToken())];
        int lineNum = Integer.parseInt(st.nextToken());
        for(int i=0; i<lineNum; i++){
            st = new StringTokenizer(br.readLine());
            int startNum = Integer.parseInt(st.nextToken())-1;
            int endNum = Integer.parseInt(st.nextToken())-1;
            int num =  Integer.parseInt(st.nextToken());
            for(int j=startNum; j<=endNum; j++){
                arr[j] = num;
            }
        }
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}