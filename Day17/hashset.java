package Day17;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        // Hashset - returns in ascending order, remove duplicate.
        HashSet<Character> hs = new HashSet<>();

        // Set can be used in leftside => HashSet, LinkedHashSet, TreeSet
        // Set<Character> hs = new HashSet<>();
        // Set<Character> hs = new LinkedHashSet<>();
        // Set<Character> hs = new TreeSet<>();

        // we can't use comparator.reverseOrder() in HashSet
        // HashSet<Character> hs = new HashSet<>(Comparator.reverseOrder());

        // We can't use lambda function 
        // HashSet <Integer> ts = new HashSet<>((a,b)->(a<b?1:-1));

        // We can't use lambda function 
        // HashSet <Integer> ts = new HashSet<>((a,b)->(a>b?1:-1));

        //LinkedHashSet - returns in same order, removes duplicate.
        // LinkedHashSet<Character> hs = new LinkedHashSet<>();
        
        hs.add('d');
        hs.add('e');
        hs.add('a');
        hs.add('e');
        hs.add('v');
        System.out.println(hs);

        Iterator hash = hs.iterator();
        while(hash.hasNext()){
            System.out.print(hash.next()+" ");
        }
        System.out.println();

        for(char i : hs){
            System.out.print(i+ " ");
        }
        System.out.println();


    }
}
