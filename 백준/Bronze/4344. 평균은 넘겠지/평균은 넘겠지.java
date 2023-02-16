import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            double sum = 0, overNum = 0, ratio;
            int arr [] = new int [studentNum];
            for(int j=0; j<studentNum; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            for(int j=0; j<studentNum; j++){
                if(arr[j]>(sum/studentNum)){
                    overNum +=1;
                }
            }
            ratio = (overNum/studentNum)*100;
            bw.write(String.format("%.3f",ratio)+"%\n");
        }
        bw.flush();
    }
}