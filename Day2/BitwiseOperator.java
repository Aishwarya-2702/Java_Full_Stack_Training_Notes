package Day2;

import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Bitwise AND
        System.out.println(a&b);

        // Bitwise OR
        System.out.println(a|b);

        // Bitwise EX-OR
        System.out.println(a^b);

        // Bitwise Complement
        System.out.println(~b);

        // Left Shift
        System.out.println(a>>3);

        // Right Shift
        System.out.println(a<<3);
        sc.close();
    }
}
