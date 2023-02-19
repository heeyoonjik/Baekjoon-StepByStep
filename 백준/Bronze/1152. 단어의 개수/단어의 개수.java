import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().trim();
        int n ;
        if(s == ""){
            n = 0;
        }else{
            n = s.split(" ").length;
        }
        bw.write(n+"");
        bw.flush();
        bw.close();
    }
}