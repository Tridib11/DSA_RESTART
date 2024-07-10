package Arrays_and_ArrayList.Merge_Without_ExtraSpace;
import java.util.*;
//https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
public class Optimal {
    public static void main(String[] args) {

    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        int left=n-1;
        int right=0;
        while(left>=0 && right<m){
            if(arr1[left]>arr2[right]){
                swap(arr1,arr2,left,right);
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    private static void swap(long arr1[],long arr2[],int left,int right){
        long temp=arr1[left];
        arr1[left]=arr2[right];
        arr2[right]=temp;
    }


}
