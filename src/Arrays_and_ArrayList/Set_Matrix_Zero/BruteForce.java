package Arrays_and_ArrayList.Set_Matrix_Zero;

public class BruteForce {
  public static void main(String[] args){
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    setZeroes(matrix);

    // Print the modified matrix
    for(int row=0; row<matrix.length; row++){
      for(int col=0; col<matrix[row].length; col++){
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }
  }

  public static void setZeroes(int[][] matrix) {
    // Iterate through the matrix to find zeroes and mark the respective rows and columns
    for(int row=0; row<matrix.length; row++){
      for(int col=0; col<matrix[row].length; col++){
        if(matrix[row][col]==0){
          markRow(row, matrix);
          markCol(col, matrix);
        }
      }
    }

    // Update the marked cells to zero
    for(int row=0; row<matrix.length; row++){
      for(int col=0; col<matrix[row].length; col++){
        if(matrix[row][col] == -1){
          matrix[row][col] = 0;
        }
      }
    }
  }

  private static void markRow(int row, int[][] matrix){
    for(int col=0; col<matrix[row].length; col++){
      if(matrix[row][col] != 0){
        matrix[row][col] = -1;
      }
    }
  }

  private static void markCol(int col, int[][] matrix){
    for(int row=0; row<matrix.length; row++){
      if(matrix[row][col] != 0){
        matrix[row][col] = -1;
      }
    }
  }
}
