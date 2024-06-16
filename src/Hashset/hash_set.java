package Hashset;

import java.util.HashSet;

public class hash_set {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();
        //doesnot store duplicate values
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
//        System.out.println(set);

        if(set.contains(1)){
            System.out.println("contains");
        }
        if(!set.contains(6)){
            System.out.println("doesnot contains");
        }


        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Doesnot contains 1");
        }
    }
}
