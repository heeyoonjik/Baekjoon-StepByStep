import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean arr [][] = new Boolean[100][100];

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                arr[i][j] = false;
            }
        }

        int n = Integer.parseInt(br.readLine()), count = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = 100 - Integer.parseInt(st.nextToken());
            for(int yValue=y-10; yValue<y; yValue++){
                for(int xValue=x; xValue<x+10; xValue++){
                    if(!arr[yValue][xValue]){
                        arr[yValue][xValue] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}