import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b-((b/100)*100);
        System.out.println((c-(c/10)*10)*a);
        System.out.println((c/10)*a);
        System.out.println((b/100)*a);
        System.out.println(a*b);
    }
}