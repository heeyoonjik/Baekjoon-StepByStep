import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<10000; i++){
            al.add(selfNumber(i));
        }
        Set<Integer> set = new HashSet<Integer>(al);
        List<Integer> newAl = new ArrayList<Integer>(set);
        for(int i=0; i<10000; i++){
            if(!newAl.contains(i)){
                bw.write(i+"\n");
                bw.flush();
            }
        }
    }


    static int selfNumber (int n){
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        int sum = n;
        for(int i=0; i<sb.length(); i++){
            sum += Integer.parseInt(String.valueOf(sb.charAt(i)));
        }
        return sum;
    }

}