package Day9;

import java.util.Scanner;

public class CalculatorMethod {
    //Without return type without argument
    public static void line(){
        System.out.println("===================");
    }

    //without return type without argument
    public static void cal(){
        System.out.println("Calculator Program");
        line();
    }

    //with return type with argument
    public static int add(int a, int b){
        return a+b;
    }

    //with return type without argument
    public static int sub(){
        int a = 10; 
        int b = 5;
        return a-b;
    }
    //without return type with argument
    public static void mul(int a){
        System.out.println("Multiplication: "+(a*a));
    }
    
    //with return type with argument
    public static int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();
        cal();
        System.out.println("Addition: "+add(a,b));
        System.out.println("Subtraction: "+sub());
        mul(5);
        System.out.println("Division: "+(div(a,b)));
        line();
        sc.close();
    }
}
