package Day2;

import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // by using modulus operator
        System.out.println(((num%2)==0)?"Even":"Odd");

        // by using bitwise AND
        System.out.println(((num&1)==0)?"Even":"Odd");

        //by using normal formula
        System.out.println(((num/2)*2)==num?"Even":"Odd");
        sc.close();
    }
}
