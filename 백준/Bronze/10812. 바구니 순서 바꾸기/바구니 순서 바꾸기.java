import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int [Integer.parseInt(st.nextToken())], temp [];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int n = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            int standard = Integer.parseInt(st.nextToken())-1;
            temp = new int [100];
            for(int k=0; k<standard-start; k++){
                temp[k] = arr[start+k];
            }
            for(int j=0; j<end-standard+1; j++){
                arr[start+j] = arr[standard+j];
            }
            for(int j=0; j<standard-start; j++){
                arr[start+end-standard+1+j] = temp[j];
            }
        }
        for(int w=0; w<arr.length; w++){
            System.out.print(arr[w]+" ");
        }
        System.out.println();

    }
}