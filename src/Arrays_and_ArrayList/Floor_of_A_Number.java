package Arrays_and_ArrayList;
//Greatest number samller or equal to the target
public class Floor_of_A_Number {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
    int target = 15;
    System.out.println(floor(arr, target));
  }

  private static int floor(int[] arr, int target) {
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==target) return arr[mid];
      if(target<arr[mid]) end=mid-1;
      else start=mid+1;
    }
    return arr[end];
  }
}
