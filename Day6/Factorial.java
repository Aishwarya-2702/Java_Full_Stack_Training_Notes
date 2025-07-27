package Day6;
import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        // return factorial(n-1) + factorial (n-2);
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
}
