package Day3;
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            int num = sc.nextInt();
            int rev = 0, count = 0, ans = 0;
            for( ; num>0; rev = rev*10 + (num%10), num /= 10, count++ );
            for( ; rev>0;ans = ans*100 + (rev%100), rev /= 100);
            System.out.println(((count&1)==1)?(ans%10 + (ans/10)):ans);
            sc.close();
    }
}
