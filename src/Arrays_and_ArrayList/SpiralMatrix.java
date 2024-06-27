package Arrays_and_ArrayList;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        int top=0,bottom=row-1,left=0,right=col-1;

        while(top<=bottom && left<=right){
            //left to right

            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //top to bottom

            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }

            right--;

            // right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }

                bottom--;
            }

            //bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }

                left++;
            }
        }
        return ans;
    }
}
