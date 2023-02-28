import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        for(int i=2, usingNumber=number; i<=number;){
            if(usingNumber%i == 0){
                usingNumber /= i;
                bw.write(i+"\n");
            }else{
                i++;
            }
        }
        bw.flush();
        bw.close();
    }
}