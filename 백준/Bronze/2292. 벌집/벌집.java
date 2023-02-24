import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()),count = 1, index = 1, i=0;
        if(n == 1){
            System.out.println(count);
        }else{
            while(true){
                count++;
                i = i+index;
                if(n<=(6*i)+1){
                    System.out.println(count);
                    break;
                }
                index++;
            }
        }
    }
}