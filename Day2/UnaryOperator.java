package Day2;

public class UnaryOperator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        System.out.println(num1++); // Post-increment
        System.out.println(++num1); // Pre- increment
        System.out.println(num2--); // Post-decrement
        System.out.println(--num2); // Pre-decrement
        System.out.println(num1++ + ++num1);
        System.out.println(num2-- - --num2);
    }
}
