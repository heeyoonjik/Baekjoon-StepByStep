import java.io.*;
public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr [][] = new char[5][15];
        for(int i=0; i<5; i++){
            String s = br.readLine();
            for(int j=0; j<15; j++){
                if(j == s.length()){
                    break;
                }
                arr[i][j] = s.charAt(j);
            }
        }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] != '\0'){
                    System.out.print(arr[j][i]);
                }
            }
        }

    }
}