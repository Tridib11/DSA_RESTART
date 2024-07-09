package Arrays_and_ArrayList;
import java.util.*;
//https://www.naukri.com/code360/problems/subarrays-with-xor-k_6826258
public class SubArrayWithXOR_K {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int xr=0;
        int prefix=0;
        for(int i=0;i<a.length;i++){
            xr=xr^a[i];

            int x=xr^b;
            if(map.containsKey(x)){
                count+=map.get(x);
            }

            if(map.containsKey(xr)){
                map.put(xr,map.get(xr)+1);
            }else{
                map.put(xr,1);
            }


        }
        return count;
    }
}
