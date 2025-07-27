package Day16;

import java.util.*;
import java.util.Iterator;

public class ArraylistCollection {
    public static void main(String[] args) {
        // List
        // ArrayList
        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(5);
        alist.add(6);
        alist.add(7);
        alist.add(8);
        alist.add(9);

        // to get the particular element in an array
        System.out.println("Index-2: "+alist.get(2));

        // to print the array elements
        System.out.println(alist);


        // we can remove the element from the array
        alist.remove(0);

        // to print the array elements
        System.out.println(alist);


        // iterator 
        Iterator i = alist.iterator();
        // System.out.println(i.next()); // next takes the value from the array
        // System.out.println(i.next());
        // System.out.println(i.next());
        // System.out.println(i.next());
        
        while(i.hasNext()){
            System.out.println("Iterators: "+i.next());
        }

        // to add the element in an array
        alist.add(10);
        System.out.println("Added element: "+alist);

        // to insert the element at specific index
        alist.add(0,5);
        System.out.println("Added element with index: "+alist);

        // to replace elements at index
        alist.set(0,2);
        System.out.println("Replace element with index: "+alist);

        // to remove the object or element
        alist.remove(0);
        System.out.println("Remove Element at index: "+alist);

        // to return the number of elements
        System.out.println("Size of an Array: "+alist.size());

        // to check if list contains element
        System.out.println("Contains element: "+alist.contains(8));

        //to check first index of element
        System.out.println("First index of element: "+alist.indexOf(8));

        // to return last index of element
        System.out.println("Last index of an element: "+alist.lastIndexOf(6));

        //to return string representation of list
        System.out.println("String Representation: "+alist.toString());

        // to remove all element
        alist.clear();
        System.out.println(alist);

        //to check if list is empty
        alist.isEmpty();
        System.out.println(alist);

    }
}
