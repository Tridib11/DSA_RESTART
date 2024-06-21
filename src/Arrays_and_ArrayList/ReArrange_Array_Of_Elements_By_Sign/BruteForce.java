package Arrays_and_ArrayList.ReArrange_Array_Of_Elements_By_Sign;

import java.util.ArrayList;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class BruteForce {
    public static void main(String[] args) {
        int n = 4;
        int A[]= {1,2,-4,-5};


        int[]ans= rearrangeArray(A,n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] rearrangeArray(int[] nums,int n) {
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();

        for(int i:nums){
            if(i>0){
                positive.add(i);
            }
            else{
                negative.add(i);
            }
        }

        for(int i=0;i<n/2;i++){
            nums[2*i]=positive.get(i);
            nums[2*i+1]=negative.get(i);
        }
        return nums;
    }
}
