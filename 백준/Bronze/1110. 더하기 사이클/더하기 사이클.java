import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int n2, c = 0;
        if(n<10){
            n = Integer.valueOf(n+"0");
        }
        n2 = n;
        while(true){
            c++;
            int a1 = n2/10;
            int a2 = n2%10;
            int sum = a1+a2;
            if(sum>9){
                sum %= 10;
            }
            n2 = Integer.parseInt(a2+""+(sum));
            if(n == n2){
                break;
            }
        }
        bw.write(c+"");
        bw.flush();
        bw.close();
    }
}