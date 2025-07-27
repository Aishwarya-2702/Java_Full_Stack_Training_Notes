// There are 100 classrooms present which are intially closed
// A man opened all the door first
// Then he closed the even number of doors like 2, 4, 6....
// Then he toggle the odd number of doors like 3, 6, 9,....
// Then he toggled 4th multiples, 5th .....
//Now, we have to find how many doors are being opened?

package Day4;

import java.util.Scanner;

public class DoorProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doors = sc.nextInt();
        int a = 1;
        for(;a*a<=doors;System.out.println(a*a), a++);
        System.out.println("No of doors: "+(a-1));
        sc.close();
    }
}
