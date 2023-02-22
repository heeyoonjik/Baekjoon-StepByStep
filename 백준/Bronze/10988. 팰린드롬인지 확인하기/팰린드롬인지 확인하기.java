import java.io.*;
public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = s.length()%2 == 0 ? s.length()/2 : (s.length()+1)/2, result = 1;
        char frontArr [] = new char [n];
        for(int i=n-1, j=0; i>=0; i--, j++){
            frontArr[j] = s.charAt(i);
        }
        for(int i= s.length()%2 ==0 ? n : n-1, j=0; i<s.length(); i++, j++){
            if(frontArr[j] != s.charAt(i)){
                result = 0;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}