import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> primeNumberList = new ArrayList<>();
        HashSet<Integer> primeNumberSet = new HashSet<>();
        for(int i=2; i<=10000; i++){
            int divisibleCount = 0;
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    divisibleCount++;
                }
            }
            if(divisibleCount == 1){
                primeNumberList.add(i);
                primeNumberSet.add(i);
            }
        }

        int repeatTime = Integer.parseInt(br.readLine());
        for(int i=0; i<repeatTime; i++){
            int givenNumber = Integer.parseInt(br.readLine()),minJ = 0;;
            int minPartitionSubtract = givenNumber;
            for(int j=0; j<primeNumberList.size(); j++){
                int primeNumberGetByJ = primeNumberList.get(j);
                int GivenNumberSubtractedByPrimeNumber = givenNumber - primeNumberGetByJ;
                if(primeNumberSet.contains(GivenNumberSubtractedByPrimeNumber)){
                    int PartitionSubtract = Math.abs(GivenNumberSubtractedByPrimeNumber - primeNumberGetByJ);
                    if(PartitionSubtract < minPartitionSubtract){
                        minPartitionSubtract = PartitionSubtract;
                        minJ = j;
                    }
                }
            }
            bw.write(primeNumberList.get(minJ)+" "+(givenNumber-primeNumberList.get(minJ))+"\n");
        }
        bw.flush();
        bw.close();
    }
}