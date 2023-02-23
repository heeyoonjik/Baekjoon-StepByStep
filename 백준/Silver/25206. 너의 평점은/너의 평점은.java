import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Double> hm = new HashMap<>(9);
        hm.put("A+",4.5);
        hm.put("A0",4.0);
        hm.put("B+",3.5);
        hm.put("B0",3.0);
        hm.put("C+",2.5);
        hm.put("C0",2.0);
        hm.put("D+",1.5);
        hm.put("D0",1.0);
        hm.put("F",0.0);
        StringTokenizer st;
        double sigma = 0, creditSum = 0;
        for(int i=0; i<20; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            Double credit = Double.parseDouble(st.nextToken());
            creditSum += credit;
            try{
                sigma += credit*hm.get(st.nextToken());
            }catch (NullPointerException e){
                creditSum -= credit;
            }
        }
        double result = sigma/creditSum;
        bw.write(Math.round(result* 1000000)/1000000.0+"");
        bw.flush();
        bw.close();

    }
}