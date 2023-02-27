import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());
        int count = 0, result = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
                if(count == standard){
                    result = i;
                    break;
                }
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}