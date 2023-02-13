import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max =  Integer.parseInt(br.readLine());
        int index = 1;
        for(int i=0; i<8; i++){
            int num =  Integer.parseInt(br.readLine());
            if(num>max){
                max = num;
                index = i+2;
            }
        }
        bw.write(max+"\n"+index);
        bw.flush();
    }
}