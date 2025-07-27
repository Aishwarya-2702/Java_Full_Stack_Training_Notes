package Day2;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        sum = (a>b)?a:b;
        System.out.println(sum);
        sc.close();
    }
}
