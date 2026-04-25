package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;           // ✅ Yeh add karo
import java.util.Map.Entry;    // ✅ Yeh add karo

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Adding pairs
        hm.put(101, "John");
        hm.put(102, "Scott");
        hm.put(103, "Mary");
        hm.put(104, "Scott");
        hm.put(102, "David");

        System.out.println(hm);
        System.out.println("Size of hashmap:" + hm.size());

        // remove pair
        hm.remove(103);
        System.out.println("After removing pair:" + hm);

        // access value of the key
        System.out.println(hm.get(102));

        // get all keys, values, entries
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        // Using Iterator
        Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();

        while (it.hasNext()) {
            Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + "     " + entry.getValue());
        }

        hm.clear();
        System.out.println(hm.isEmpty()); // true
    }
}