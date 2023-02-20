import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int [Integer.parseInt(st.nextToken())];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int tryNum = Integer.parseInt(st.nextToken());
        for(int i=0; i<tryNum; i++){
            st = new StringTokenizer(br.readLine());
            int b1 = Integer.parseInt(st.nextToken())-1;
            int b2 = Integer.parseInt(st.nextToken())-1;
            int temp = arr[b1];
            arr[b1] = arr[b2];
            arr[b2] = temp;
        }
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}