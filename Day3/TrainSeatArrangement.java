package Day3;

import java.util.Scanner;

public class TrainSeatArrangement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n %= 8;
        if(n == 1 || n == 4){
            System.out.println("Lower");
        }
        else if(n == 2 || n == 5){
            System.out.println("Middle");
        }
        else if(n == 3 || n == 6){
            System.out.println("Upper");
        }
        else if( n == 7){
            System.out.println("Side Lower");
        }
        else if(n == 0){
            System.out.println("Side Upper");
        }
        sc.close();
    }
}
