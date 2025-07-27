package Day3;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        int rev = 0;
        while(num>0){
            count++;
            sum +=(num%10);
            rev = (rev*10) + (num%10);
            num/=10;
        }
        System.out.println("Count: "+count);
        System.out.println("Sum of digits: "+sum);
        System.out.println("Reverse: "+rev);
        sc.close();
    }
}
