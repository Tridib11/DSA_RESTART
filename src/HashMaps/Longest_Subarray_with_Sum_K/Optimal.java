package HashMaps.Longest_Subarray_with_Sum_K;
//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
/*
time complexity O(n)
https://www.youtube.com/watch?v=-TmXl8zo7mA
 */
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
                maxLength=i+1;
            }
            else if(map.containsKey(sum-K)){
                maxLength=Math.max(maxLength,i-map.get(sum-K));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return maxLength;
    }
}
