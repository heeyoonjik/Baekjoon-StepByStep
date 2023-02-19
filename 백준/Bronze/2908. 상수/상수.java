import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int [2];
        for(int i=0; i<2; i++){
            int n = Integer.parseInt(st.nextToken());
            arr[i] = (n%10*100) +((n%100)/10)*10 + n/100;
        }
        if(arr[0]>arr[1]){
            bw.write(arr[0]+"");
        }else{
            bw.write(arr[1]+"");
        }
        bw.flush();
        bw.close();
    }
}