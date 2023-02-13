import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr [] = new int [28];
        for(int i=0; i<28; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=1; i<=30; i++){
            for(int j=0; j<arr.length; j++){
                if(i == arr[j]){
                    break;
                }
                if(j == arr.length-1){
                    bw.write(i+"\n");
                }
            }
        }
        bw.flush();
    }
}