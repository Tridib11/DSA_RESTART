package Arrays_and_ArrayList;

public class Ceiling_of_A_number {
  public static void main(String[] args){
    int[] arr={2,3,5,9,14,16,18};
    int target=15;
    System.out.println(ceiling(arr,target));
  }

  private static int ceiling(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==target){
        return arr[mid];
      }

      if(target<arr[mid]){
        end=mid-1;
      }
      else{
        start=mid+1;
      }
    }

    return arr[start];
  }
}
