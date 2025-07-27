package Day16;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistCollection { // efficient for insertion and deletion
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<Integer>();

        // to add the element
        List.add(2);
        List.add(3);
        System.out.println("Added Element: "+List);

        // to add the element in the first
        List.addFirst(1);
        System.out.println("First element is added: "+List);

        // to get the particular element
        System.out.println("Particular element: "+List.get(2));

        // to get the first element
        System.out.println("First element: "+List.getFirst());

        // to get the last element
        System.out.println("Last element: "+List.getLast());

        // to remove the first element
        System.out.println("Remove First element: "+List.removeFirst());

        // to remove the last element
        System.out.println("Remove Last element: "+List.removeLast());

        Iterator i = List.iterator();
        System.out.print("Iterators: ");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
