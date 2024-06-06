package Arrays_and_ArrayList;
import java.util.*;
public class MoveZeroes {
  public static void main(String[] args) {
    int[] arr={0,1,0,3,12};
    
    System.out.println(Arrays.toString(move(arr)));
  }
  
  private static int[] move(int[] arr){
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[j++]=arr[i];
      }
    }
    while(j<arr.length){
      arr[j++]=0;
    }
    return arr;
  }
}
