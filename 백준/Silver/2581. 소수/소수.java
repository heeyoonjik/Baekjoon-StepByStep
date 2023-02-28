import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int minPrimeNumber = max, primeNumberSum = 0;
        for(int i=min; i<=max; i++){
            int num = i, count = 0;
            for(int j=1; j<=num; j++){
                if(num%j == 0){
                    count++;
                }
            }
            if(count == 2){
                if(num<minPrimeNumber){
                    minPrimeNumber = num;
                }
                primeNumberSum += num;
            }
        }
        if(primeNumberSum == 0){
            bw.write(-1+"");
        }else{
            bw.write(primeNumberSum+"\n");
            bw.write(minPrimeNumber+"");
        }
        bw.flush();
        bw.close();
    }
}