import java.io.*;
public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char a [] = new char[26];

        for(int i=0; i<a.length; i++){
            a[i] = (char) (97+i);
        }

        for(int i =0; i<a.length; i++){
            for(int j=0; j<s.length(); j++){
                if(a[i] == s.charAt(j)){
                    System.out.print(j+" ");
                    break;
                }
                if(j == s.length()-1){
                    System.out.print(-1+" ");
                }
            }
        }
    }
}