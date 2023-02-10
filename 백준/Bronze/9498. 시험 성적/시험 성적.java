import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        String grade = "";
        if(score <60){
            grade = "F";
        }else if(score<70){
            grade = "D";
        }else if(score<80){
            grade = "C";
        }else if(score<90){
            grade = "B";
        }else if(score<=100){
            grade = "A";
        }
        System.out.println(grade);
    }
}