package Arrays_and_ArrayList;
import java.util.*;
public class First_and_last_Position_of_element_in_sorted_Array {
    public static void main(String[] args) {
      int[] arr={5,6,7,8,8,10};
      int target=8;
      System.out.println(Arrays.toString(first_and_last_position(arr,target)));
    }


    private static int[] first_and_last_position(int[] arr,int target){
      int[] ans={-1,-1};
      int start=0;
      int end=arr.length-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
          ans[0]=mid;
          end=mid-1;
        }
        else if(target<arr[mid]) end=mid-1;
        else start=mid+1;
      }

      start=0;
      end=arr.length-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
          ans[1]=mid;
          start=mid+1;
        }
        else if(target<arr[mid]) end=mid-1;
        else start=mid+1;
      }
      return ans;
    }
}
