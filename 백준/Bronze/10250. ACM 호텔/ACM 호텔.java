import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int k1 = (num/h)+1;
            int k2 = num%h;
            if(k2 ==0){
                k2 = h;
                k1 -= 1;
            }
            if(k1>=10){
                bw.write(k2+""+k1+"\n");
            }else{
                bw.write(k2+"0"+k1+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
