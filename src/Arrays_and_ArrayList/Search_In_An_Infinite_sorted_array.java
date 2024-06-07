package Arrays_and_ArrayList;

public class Search_In_An_Infinite_sorted_array {
  public static void main(String[] args) {
    int[] arr={1,3,5,6,7,99,100};
    rangeDecider(arr,3);
  }

  static void rangeDecider(int[] arr,int target){
    int start=0;
    int end=1;
    while(target>arr[end]){
      int newStart=end+1;
      end=end+(end-start+1)*2;
      start=newStart;
    }
    System.out.println(search(arr,target,start,end));


  }


  static int search(int[] arr,int target,int start,int end){
    while(start<=end){
      int mid=start+(end-start)/2;
      if(target==arr[mid]){
        return mid;
      }

      if(target<arr[mid]){
        end=mid-1;
      }
      else {
        start=mid+1;
      }
    }

    return -1;
  }
}
