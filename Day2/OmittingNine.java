package Day2;

import java.util.Scanner;

public class OmittingNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num+(num/9)));
        sc.close();
    }
}
