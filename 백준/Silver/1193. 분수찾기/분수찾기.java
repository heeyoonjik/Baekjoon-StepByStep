import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int i = 1, sum = 0;
        while(true){
            sum += i;
            if(n<=sum){
                break;
            }
            i++;
        }
        int k = sum-n;
        if(i%2==0){
            bw.write((i-k)+"/"+(1+k));
        }else{
            bw.write((1+k)+"/"+(i-k));
        }
        bw.flush();
        bw.close();
    }
}