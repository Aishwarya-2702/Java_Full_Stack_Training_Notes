package Day17;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        //  Map<Integer, String> hm = new HashMap<>();

        // Put - Add or updates a key-value pair
        // key should not duplicated, values can.
        hm.put(1, "Aishu");
        hm.put(2, "Vinu");
        hm.put(3, "Abi");
        System.out.println(hm); // Iterator can't be use.

        // to get the value
        System.out.println(hm.get(1));

        // to check whether it is present or not
        System.out.println(hm.containsKey(4)); // returns true or false

        // to clear use clear()
        hm.clear();
        System.out.println(hm);
    }
}
