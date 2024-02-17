package week4_day5;

import java.util.HashSet;
import java.util.Set;

public class Practice5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); 

        System.out.println("Set elements: " + set);

        System.out.println("Set size: " + set.size());
    }
}
