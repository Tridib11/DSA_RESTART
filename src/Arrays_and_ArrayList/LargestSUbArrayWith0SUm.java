package Arrays_and_ArrayList;

/*
https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
 */
import java.util.*;
public class LargestSUbArrayWith0SUm {
    public static void main(String[] args) {

    }

    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxSum=0;
        map.put(0, -1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.get(sum)!=null){
                maxSum=Math.max(maxSum,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxSum;
    }
}
