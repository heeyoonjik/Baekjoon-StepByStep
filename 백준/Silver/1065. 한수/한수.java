import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(hanNum(i)){
                sum++;
            }
        }
        System.out.print(sum);
    }

    static boolean hanNum(int n){
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        int arr [] = new int [sb.length()-1];
        if(n<=99){
            return true;
        }
        else  {
            for (int i = 0; i < sb.length() -1 ; i++) {
                arr[i] = sb.charAt(i + 1) - sb.charAt(i);
            }
            for (int i = 0; i <arr.length-1; i++) {
                if (arr[i] != arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }

}