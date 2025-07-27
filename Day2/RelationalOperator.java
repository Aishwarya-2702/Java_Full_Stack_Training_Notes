package Day2;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a==b); // Equal to
        System.out.println(a!=b); //Not equal to
        System.out.println(a>b); // Greater than
        System.out.println(a<b); // Lesser than
        System.out.println(a>=b); // Greater than or equal to
        System.out.println(a<=b); // Lesser than or equal to
        sc.close();
    }
}
