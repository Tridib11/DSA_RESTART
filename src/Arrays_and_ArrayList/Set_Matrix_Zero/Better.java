package Arrays_and_ArrayList.Set_Matrix_Zero;
//https://leetcode.com/problems/set-matrix-zeroes/description/


/*
Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
Reason: We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

Space Complexity: O(N) + O(M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
Reason: O(N) is for using the row array and O(M) is for using the col array.
*/
public class Better {
  public static void main(String[] args) {
    int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    setZeroes(matrix);

    // Print the modified matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static void setZeroes(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;  // Change from matrix[row].length to matrix[0].length to avoid ArrayIndexOutOfBoundsException
    int[] externalRow = new int[row];
    int[] externalCol = new int[col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (matrix[i][j] == 0) {  // Change from matrix[row][col] to matrix[i][j] to check the current element
          externalRow[i] = 1;
          externalCol[j] = 1;
        }
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (externalRow[i] == 1 || externalCol[j] == 1) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
