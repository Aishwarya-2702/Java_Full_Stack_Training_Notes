package Day4;
import java.util.Scanner;

public class SquareOf2DigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int aSquare, twoAB, bSquare;
        int a = num / 10;
        int b = num % 10;
         aSquare = a*a;
         twoAB = 2*a*b;
         bSquare = b*b;
         twoAB += bSquare /10;
         bSquare = bSquare % 10;
         aSquare += twoAB / 10;
         twoAB = twoAB % 10;
         System.out.println(""+aSquare+twoAB+bSquare);
         sc.close();
    }
}
