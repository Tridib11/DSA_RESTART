package Arrays_and_ArrayList.MapOverLappingIntervals;
import java.util.*;
public class Optimal {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        for(int[] interval:intervals){
            if(ans.isEmpty() || interval[0]>ans.get(ans.size()-1)[1]){
                ans.add(interval);
            }else{
                ans.get(ans.size()-1)[1]=Math.max(interval[1],ans.get(ans.size() - 1)[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
