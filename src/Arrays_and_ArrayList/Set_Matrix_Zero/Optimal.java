package Arrays_and_ArrayList.Set_Matrix_Zero;

public class Optimal {
    public static void main(String[] args) {
        
    }

    private static void setZeroes(int[][] matrix){
        int row=matrix.length;
        int col=matrix[row].length;
        
        int flagFirstRow=1;
        int flagFirstCol=1;

        for(int i=0;i<row;i++){
            if(matrix[0][i]==0){
                flagFirstRow=0;
            }
        }

        for(int j=0;j<col;j++){
            if(matrix[j][0]==0){
                flagFirstCol=0;
            }
        }

    }
}
