package Arrays_and_ArrayList.PascalsTriangle_revision;
import java.util.*;
public class Version3 {
    public static void main(String[] args) {
//https://leetcode.com/problems/pascals-triangle/description/
        /*
        T - O(n^2)
         */
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ans.add(generateRows(row));
        }
        return ans;
    }

    private List<Integer> generateRows(int eachRows){
        long ans=1;
        List<Integer> rows=new ArrayList<>();
        rows.add(1);
        for(int col=1;col<eachRows;col++){
            ans=ans*(eachRows-col);
            ans=ans/col;
            rows.add((int)ans);
        }
        return rows;
    }
}
