import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(a == b && b == c){
            answer = 10000+a*1000;
        }else if((a == b && b !=c )||(a == c && c !=b ) || (b == c && c !=a ) ){
            if(a==c || a==b){
                answer = 1000+a*100;
            } else if(b ==c){
                answer = 1000+b*100;
            }
        }else if(a != b && a != c && b!= c){
            int max = a;
            int arr [] = {a,b,c};
            for(int i=0;  i<3; i++){
                if(arr[i]>max)
                    max = arr[i];
            }
            answer = max*100;
        }
        System.out.println(answer);
    }
}