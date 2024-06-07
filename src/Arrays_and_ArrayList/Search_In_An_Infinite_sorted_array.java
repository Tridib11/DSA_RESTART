package Arrays_and_ArrayList;

public class Search_In_An_Infinite_sorted_array {
  public static void main(String[] args) {
    
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
      
    }
  }
}
