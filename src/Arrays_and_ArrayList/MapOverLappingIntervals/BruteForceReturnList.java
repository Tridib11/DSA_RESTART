package Arrays_and_ArrayList.MapOverLappingIntervals;
import java.util.*;
public class BruteForceReturnList {
    public static void main(String[] args) {

    }
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            for(int j=i+1;j<arr.length;j++){
                if(arr)
            }
        }
    }
}
