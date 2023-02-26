import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int arr [][] = new int[a+1][b];
            for(int k=0; k<1; k++){
                for(int j=0; j<arr[k].length; j++){
                    arr[k][j] = j+1;
                }
            }
            for(int k=1; k<arr.length; k++){
                for(int j=0; j<arr[k].length; j++){
                    if(j==0){
                        arr[k][j] = 1;
                    }else{
                        arr[k][j] = arr[k][j-1]+arr[k-1][j];
                    }
                }
            }
            bw.write(arr[a][b-1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}