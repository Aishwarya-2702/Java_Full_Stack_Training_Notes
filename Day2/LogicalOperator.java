package Day2;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // AND operator
        if((a<=b)&&(a==b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        //OR Operator
        if((a<b)||(a==b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        //Not Operator
        if(!(a<b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
