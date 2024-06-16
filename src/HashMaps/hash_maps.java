package HashMaps;

import java.util.HashMap;

public class hash_maps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("China",30);
        map.put("US",150);
        System.out.println(map);
        map.put("US",190);
        System.out.println(map);
    }
}
