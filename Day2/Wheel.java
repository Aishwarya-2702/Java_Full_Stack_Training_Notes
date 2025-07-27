// The problem is about they have given the count of wheels and vehicles, we have to find how many two wheelers and four wheelers are present.
// Wheels: 540
//Vehicles: 200
package Day2;

import java.util.Scanner;
public class Wheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int v = sc.nextInt();
        int tw = ((v*4)-w)/2;
        if((w&1)==0 && (w>v)){
            System.out.println("Tw: "+tw+" Fw: "+(v-tw));
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
