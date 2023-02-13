import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int min = max;
        for(int i=0; i<n-1; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num>max){
                max = num;
            }else if(num<min){
                min = num;
            }
        }
        bw.write(min+" "+max);
        bw.flush();
    }
}