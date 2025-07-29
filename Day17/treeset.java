package Day17;

import java.util.*;
import java.util.Iterator;

public class treeset {
    public static void main(String[] args){

        // comparator.reverorder() - helps to reverse the object into descending order
        TreeSet <Integer> ts = new TreeSet<>();

        // if we removed the comparator.reverseOrder() - it prints in ascending order by default.
        // TreeSet <Integer> ts = new TreeSet<>(Comparator.reverseOrder());

        // lambda function - to reverse the process in descending order, in descending order duplicates will not removed.
        // TreeSet <Integer> ts = new TreeSet<>((a,b)->(a<b?1:-1));

        // lambda function - to reverse the process in ascending order, in ascending order duplicates will not removed.
        // TreeSet <Integer> ts = new TreeSet<>((a,b)->(a>b?1:-1));

        // to add the elements
        ts.add(3);
        ts.add(4);
        ts.add(7);
        ts.add(7);
        ts.add(6);
        // System.out.print(ts);

        // to get the size of the treeset
        System.out.println("Size of the TreeSet: "+ts.size());

        // We can use the iterator
        Iterator tree = ts.iterator();
        while(tree.hasNext()){
            System.out.print(tree.next()+" ");
        }
        System.out.println();

        // we can use the iterator in descending order
        Iterator tree1 = ts.descendingIterator();
        while(tree1.hasNext()){
            System.out.print(tree1.next()+" ");
        }
        System.out.println();

        // Iterate the value by for each loop
        for(int i:ts){
            System.out.print(i+" ");
        }
        System.out.println();

        // to convert treeset to array
        Object[] a = ts.toArray();
        for(int i=0; i<a.length; i++){
            System.out.println("Array element: "+a[i]+" ");
        }

        // remove the first element
        System.out.println("PollFirst Element: "+ts.pollFirst());
        System.out.println(ts);

        // remove the last element
        System.out.println("pollLast Element: "+ts.pollLast());
        System.out.println(ts);

        // to remove based  - the element(based on object) will returns the boolean like true or false
        System.out.println("Remove Element: "+ts.remove(4));
        System.out.println(ts);
    }
}
