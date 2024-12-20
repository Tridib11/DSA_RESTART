package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class hash_maps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("China",30);
        map.put("US",150);
        System.out.println(map);
        map.put("US",190);
        System.out.println(map);


        //searching

        if(map.containsKey("China")){
            System.out.println("Key contains in the map");
        }

        if(map.containsValue(30)){
            System.out.println("value contains in the map");
        }

        System.out.println(map.get("US"));
        System.out.println(map.get("Nepal"));



        //Looping in Hashmap


        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        map.remove("China");
        System.out.println(map);
    }
}
