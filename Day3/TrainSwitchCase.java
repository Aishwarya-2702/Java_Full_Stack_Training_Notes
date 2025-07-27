package Day3;
import java.util.Scanner;
public class TrainSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seat = sc.nextInt();
        seat %= 8;
        switch(seat){
            default: System.out.println("Stop"); break;
            case 4: case 1: System.out.println("Lower"); break;
            case 5: case 2: System.out.println("Middle"); break;
            case 3: case 6: System.out.println("Upper"); break;
            case 7: System.out.println("Side Lower"); break;
            case 0: System.out.println("Side Upper");
        }
        sc.close();
    }
}
