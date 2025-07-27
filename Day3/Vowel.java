package Day3;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        switch (letter) {
            default : 
            System.out.println("Consonents"); break;
            case 'a', 'e', 'i', 'o', 'u': System.out.println("Vowel");
        }
        sc.close();
    }
}
