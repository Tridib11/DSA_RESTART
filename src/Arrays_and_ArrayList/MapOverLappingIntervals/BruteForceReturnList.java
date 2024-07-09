package Arrays_and_ArrayList.MapOverLappingIntervals;
import java.util.*;
public class BruteForceReturnList {
    public static void main(String[] args) {
//https://www.naukri.com/code360/problems/merge-all-overlapping-intervals_6783452
    }
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0];
            int end=arr[i][1];

            //skip all the merged elements

            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end,arr[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        return ans;
    }
}
