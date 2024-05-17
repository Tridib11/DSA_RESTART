package Arrays_and_ArrayList;

import java.util.*;
public class Order_Agnostic_Binary_Search {
  public static void main(String[] args){
    int[] arr={2};
    int target=2;
    int ans=0;
    if(arr.length==1){
      ifJustOne(arr,target);
      return;
    }
    if(arr[0]<arr[arr.length-1]){
      ans=aescendingBS(arr,target);
    }
    else {
      ans=descendingBS(arr,target);
    }  

    System.out.println(ans);
  }


  private static void ifJustOne(int[] arr,int target){
    if(arr[0]==target){
      System.out.println(0);
    }
    else{
      System.out.println(-1);
    }
  }


  private static int aescendingBS(int[] arr,int target){
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (target < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }


  private static int descendingBS(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==target){
        return mid;
      }
      if(target<arr[mid]){
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
    return -1;
  }
}
