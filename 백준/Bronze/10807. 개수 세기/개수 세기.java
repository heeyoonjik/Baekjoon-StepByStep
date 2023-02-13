import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n [] = new int [Integer.parseInt(st.nextToken())];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n.length; i++){
            n[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine()), count = 0;
        for(int i=0; i<n.length; i++){
            if(n[i]==v){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}