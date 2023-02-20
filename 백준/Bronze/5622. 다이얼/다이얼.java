import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int timeSum = 0;
        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'A':
                case 'B':
                case 'C':
                    timeSum += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    timeSum += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    timeSum += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    timeSum += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    timeSum += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    timeSum += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    timeSum += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    timeSum += 10;
                    break;
            }
        }
        bw.write(timeSum+"");
        bw.flush();
        bw.close();
    }
}