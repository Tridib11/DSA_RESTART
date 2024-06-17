package HashMaps.Longest_Subarray_with_Sum_K;

//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

import java.util.*;
public class bruteForce {
    public static void main(String[] args) {
/*
10 5  2  7  1  9
10 15 17 24 25 34

{10,1}
{15,2}
{17,3}
{24,4}
{25,5}
{34,6}
.
.
.
k=15


Time Complexity : O(n^2)   TLE
 */
    }

    public static int lenOfLongSubarr (int arr[], int N, int K) {
        //Complete the function
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++){
                sum+=arr[j];
                if(!map.containsKey(sum)){
                    map.put(sum,j-i+1);
                }else{
                    int val=Math.max(j-i+1,map.get(sum));
                    map.put(sum,val);
                }
            }
        }
        return map.getOrDefault(K,0);

    }
}
