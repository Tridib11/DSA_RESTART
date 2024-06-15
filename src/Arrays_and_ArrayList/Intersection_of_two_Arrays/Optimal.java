package Arrays_and_ArrayList.Intersection_of_two_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int[] ans=new int[nums2.length];
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                ans[k]=nums2[j];
                k++;
                i++;
                j++;
            }
        }
        return ans;
    }
}
