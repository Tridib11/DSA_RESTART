package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();
        //doesnot store duplicate values
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
//        System.out.println(set);

        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("size of the set is " + set.size());
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
