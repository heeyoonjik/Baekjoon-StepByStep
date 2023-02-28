import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeatNumber = Integer.parseInt(br.readLine());
        int primeNumberCount = 0;
        StringTokenizer numberLine = new StringTokenizer(br.readLine());
        for(int i=0; i<repeatNumber; i++){
            int targetNumber = Integer.parseInt(numberLine.nextToken()), count = 0;
            for(int j=1; j<=targetNumber; j++){
                if(targetNumber%j==0) {
                    count++;
                }
            }
            if(count == 2){
                primeNumberCount++;
            }
        }
        bw.write(primeNumberCount+"");
        bw.flush();
        bw.close();
    }
}