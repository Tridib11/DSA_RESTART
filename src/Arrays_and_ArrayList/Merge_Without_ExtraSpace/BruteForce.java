package Arrays_and_ArrayList.Merge_Without_ExtraSpace;
import java.util.*;
public class BruteForce {
    public static void main(String[] args) {

    }

    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        long[] arr3=new long[m+n];
        int left=0,right=0,index=0;
        while(left<n && right <m ){
            if(arr1[left]<=arr2[right]){
                arr3[index]=arr1[left];
                index++;left++;
            }else{
                arr3[index]=arr2[right];
                index++;right++;
            }
        }

        while(left<n){
            arr3[index]=arr1[left];
            index++;left++;
        }
        while(right<m){
            arr3[index]=arr2[right];
            index++;right++;
        }

        for(int i=0;i<n+m;i++){
            if(i<n){
                arr1[i]=arr3[i];
            }else{
                arr2[i-n]=arr3[i];
            }
        }

    }
}
