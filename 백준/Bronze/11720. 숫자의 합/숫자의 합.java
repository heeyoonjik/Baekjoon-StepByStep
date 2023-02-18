import java.io.*;
public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine()), sum = 0;
        String b = br.readLine();
        for(int i=0; i<a; i++){
            sum += Integer.parseInt(b.charAt(i)+"");
        }
        bw.write(sum+"");
        bw.flush();
    }
}