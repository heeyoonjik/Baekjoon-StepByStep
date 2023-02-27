import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num;
        while((num = Integer.parseInt(br.readLine())) != -1){
            int sum = 0;
            ArrayList<Integer> numRecord = new ArrayList<>();
            for(int i=1; i<num; i++){
                if(num%i == 0){
                    numRecord.add(i);
                    sum += i;
                }
            }
            if(sum == num){
                bw.write(num+" = ");
                for(int i=0; i<numRecord.size()-1; i++){
                    bw.write(numRecord.get(i)+" + ");
                }
                bw.write(numRecord.get(numRecord.size()-1)+"\n");
            }else{
                bw.write(num+" is NOT perfect.\n");
            }
        }
        bw.flush();
        bw.close();
    }
}