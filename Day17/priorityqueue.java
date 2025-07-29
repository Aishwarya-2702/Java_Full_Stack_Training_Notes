package Day17;

import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pr = new PriorityQueue<>();

        //Lambda function - reverse the priorityQueue data
        // PriorityQueue<Integer> pr = new PriorityQueue<>((a,b)->(a<b)?1:-1);

        // Queue<Integer> pr = new PriorityQueue<>();

        //Deque is applicable only in linkedlist and ArrayDeque
        // Deque<Integer> pr = new LinkedList<>();
        Deque<Integer> pr = new ArrayDeque<>();

        // Insert the data - no sorted, will accept the duplicated, 
        pr.add(2);
        pr.add(3);
        pr.add(4);
        pr.add(5);
        pr.add(2);
        System.out.println(pr);
    }
}
