import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1 = st.nextToken();
        String num2 = st.nextToken();
        StringBuilder result = new StringBuilder();
        int arrayLength = num1.length();
        if(num1.length() < num2.length()){
            arrayLength = num2.length();
        }
        int num1Array [] = new int [arrayLength];
        int num2Array [] = new int [arrayLength];

        for(int i=0; i<num1Array.length; i++){
            if(i>=num1.length()){
                num1Array[num1Array.length-1-i] = 0;
            }else{
                num1Array[num1Array.length-1-i] = Integer.parseInt(String.valueOf(num1.charAt(num1.length()-1-i)));
            }
            if(i>=num2.length()){
                num2Array[num1Array.length-1-i] = 0;
            }else{
                num2Array[num1Array.length-1-i] = Integer.parseInt(String.valueOf(num2.charAt(num2.length()-1-i)));
            }
        }
        int upper = 0;
        for(int i=0; i<num1Array.length; i++){
        }
        for(int i=arrayLength-1; i>=0; i--){
            int sum = num1Array[i]+num2Array[i];
            if(upper + sum >= 10){
                result.insert(0, (upper+sum) % 10);
                upper = (upper+sum)/10;
                if(i==0){
                    result.insert(0, upper);
                }
            }else{
                result.insert(0, upper+sum);
                upper = 0;
            }
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}