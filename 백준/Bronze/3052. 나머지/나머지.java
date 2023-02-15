import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> al = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr [] = new int [10];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine())%42;
        }
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>=0; j--){
                if((arr[i] == arr[j]) && (i!=j)){
                    break;
                }
                if(j==0){
                    al.add(arr[i]);
                }
            }
        }
        bw.write(""+(al.size()+1));
        bw.flush();
    }
}