package Day9;

import java.util.Scanner;

public class Reverse {
    //with return type with argument
    public static String rev(String name){
        String r = "";
        char ch;
        for(int i =0; i<name.length(); i++){
            ch = name.charAt(i);
            r = ch+r;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = sc.nextLine();
        System.out.println("Reversed Name: "+rev(name));
        sc.close();

    }
}
