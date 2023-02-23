import java.io.*;
import java.util.ArrayList;
public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<n; i++){
            ArrayList<Character> al = new ArrayList<>(n);
            String s = br.readLine();
            al.add(s.charAt(0));
            for(int j=1; j<s.length(); j++){
                if(al.contains(s.charAt(j))){
                    if(s.charAt(j) != s.charAt(j-1)){
                        count--;
                        break;
                    }
                }else{
                    al.add(s.charAt(j));
                }
            }
            count++;
        }
        bw.write(count+"");
        bw.flush();
        bw.close();

    }
}