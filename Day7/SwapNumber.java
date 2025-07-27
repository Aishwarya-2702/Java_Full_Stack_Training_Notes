package Day7;
import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // by using Bitwise EXOR
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);

        // by using * and / 
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a);
        System.out.println(b);

        // by using + and -
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);

        // by using third variable
        int temp = 0;
        temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
