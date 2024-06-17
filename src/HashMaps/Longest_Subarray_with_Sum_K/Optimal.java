package HashMaps.Longest_Subarray_with_Sum_K;

import java.util.HashMap;
import java.util.Map;

public class Optimal {
    public static void main(String[] args) {

    }
    public static int lenOfLongSubarr (int arr[], int N, int K){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLength=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(sum==K){
                maxLength+=1;
            }
            else if()
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
    }
}
