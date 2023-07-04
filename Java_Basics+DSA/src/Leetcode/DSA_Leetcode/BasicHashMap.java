package Leetcode.DSA_Leetcode;
import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {
    public static void main(String[] args) {
        //COUNTRY --> KEY , POPULATION --> VALUE
        HashMap<String , Integer> map = new HashMap<>();

        //INSERTION
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);
//
        map.put("China", 180);
        System.out.println(map); //UPDATE HOAJATA HAI

        //SEARCH
        if (map.containsKey("nepal  ")){
            System.out.println("Key is present");
        }
        else {
            System.out.println(" Key is not present");
        }

        System.out.println(map.get("China")); //Key Exists
        System.out.println(map.get("nepal")); //key not exists

        //ITERATOR
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        REMOVE
        map.remove("China");
        System.out.println(map);
    }
}
