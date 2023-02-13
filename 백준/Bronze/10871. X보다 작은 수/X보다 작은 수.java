import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++){
        int num = Integer.parseInt(st.nextToken());
        if(num<max){
            bw.write(num+" ");
            bw.flush();
        }
    }
    }
}