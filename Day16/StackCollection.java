package Day16;

import java.util.Iterator;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // to add the elements in the stack
        s.push(2);
        s.push(3);
        System.out.println("Stack elements: "+s);

        // to check the peek element
        System.out.println("Peek Element: "+s.peek());

        // to delete the elements in the stack
        System.out.println("Remove Elements: "+s.pop());

        Iterator i = s.iterator();
        System.out.print("Iterators: ");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
