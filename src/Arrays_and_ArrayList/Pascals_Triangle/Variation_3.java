package Arrays_and_ArrayList.Pascals_Triangle;

//https://leetcode.com/problems/pascals-triangle/description/

/*
 * Time Complexity: O(n2), where n = number of rows(given).
 * 
 * Reason: We are generating a row for each single row. The number of rows is n. And generating an entire row takes O
 * (n) time complexity.
 * 
 * Space Complexity: In this case, we are only using space to store the answer That is why space 
 * complexity can still be considered as O(1).
 */


import java.util.*;

public class Variation_3 {
  public static void main(String[] args) {
    
  }

  private static List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans=new ArrayList<>();
       for(int row=1;row<=numRows;row++){
        ans.add(generateRows(row));
       }
       return ans;
  }

  private static List<Integer> generateRows(int row){
    long ans=1;
    List<Integer> ansRow=new ArrayList<>();
    ansRow.add(1);
    for(int col=1;col<row;col++){
      ans=ans*(row-col);
      ans=ans/col;
      ansRow.add((int)ans);
    }

    return ansRow;
  }


}
