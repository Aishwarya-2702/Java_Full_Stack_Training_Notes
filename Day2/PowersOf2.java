package Day2;

import java.util.Scanner;

public class PowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.err.println((num&(num-1))==0?"Yes":"No");
        sc.close();
    }
}
