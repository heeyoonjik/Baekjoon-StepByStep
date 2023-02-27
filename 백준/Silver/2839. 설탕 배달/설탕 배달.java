import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int big = n/5, i;
        for(i = big; i>0; i--){
            if((n - (5*i))%3 == 0){
                break;
            }
        }
        if(i==0){
            if(n%3 == 0){
                bw.write((n/3)+"");
            }else{
                bw.write(-1+"");
            }
        }else{
            bw.write((i+(n - (5*i))/3)+"");
        }

        bw.flush();
        bw.close();
    }
}