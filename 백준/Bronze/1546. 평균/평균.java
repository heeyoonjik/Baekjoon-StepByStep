import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double arr [] = new double [n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        double max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
        bw.write(""+(sum/arr.length));
        bw.flush();
    }
}