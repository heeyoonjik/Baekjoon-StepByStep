import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Set<String> set = new HashSet<>();
        set.add("c=");
        set.add("c-");
        set.add("dz=");
        set.add("d-");
        set.add("lj");
        set.add("nj");
        set.add("s=");
        set.add("z=");
        int count = 0;
            while(s.length()!=0){
                int index;
                String slice = s;
                if(s.length()>2){
                    slice = s.substring(0,2);
                }
                if(set.contains(slice)){
                    index = 2;
                }else if(s.length()>2 && set.contains(s.substring(0,3))){
                    index = 3;
                }else{
                    index = 1;
                }
                count++;
                s = s.substring(index,s.length());
            }
            bw.write(count+"");
            bw.flush();
            bw.close();

    }
}