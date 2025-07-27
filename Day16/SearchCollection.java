package Day16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchCollection {
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size: ");
        // int size = sc.nextInt();
        // for(int i=0; i<size; i++){
        //     List.add(sc.nextInt());
        // }
        // System.out.println(List);

        // if(List.contains(5)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        //Get input without size
        // while(true){
        //     int a = sc.nextInt();
        //     if(a==-1) break;
        //     List.add(a);
        // }
        // int finder = sc.nextInt();
        // System.out.println((List.contains(finder))?"Yes":"No");

        //Remove the even number from the list
        // while(true){
        //     int a = sc.nextInt();
        //     if(a==-1) break;
        //     List.add(a);
        // }
        // int size = (List.size())-1;
        // while(size>0){
        //     if(List.get(size)%2==0){
        //         List.remove(size);
        //         size--;
        //     }
        //     size--;
        // }
        // System.out.print(List);

        // Merge List
        LinkedList<Integer> List2 = new LinkedList<Integer>();
        while(true){
            int a = sc.nextInt();
            if(a==-1) break;
            List.add(a);
        }
        while(true){
            int b = sc.nextInt();
            if(b==-1) break;
            List2.add(b);
        }
        // merge the 2 list
        List.addAll(List2);
        Collections.sort(List);
        System.out.println(List);

        sc.close();
    }
}
