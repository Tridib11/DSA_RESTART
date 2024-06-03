package Arrays_and_ArrayList.Set_Matrix_Zero;

/*

Time Complexity: O((N*M)*(N + M)) + O(N*M),

where N = no. of rows in the matrix and M = no. of columns in the matrix
Reason: Firstly, we are traversing the matrix to find the cells with the value 0. It takes O(N*M). Now, whenever we find any such cell we mark that row and column with -1. This process takes O(N+M). So, combining this the whole process, finding and marking, takes O((N*M)*(N + M)).
Another O(N*M) is taken to mark all the cells with -1 as 0 finally.

Space Complexity: O(1) as we are not using any extra space.

 */
public class BruteForce {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    setZeroes(matrix);

    // Print the modified matrix
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }
  }

  public static void setZeroes(int[][] matrix) {
    // Iterate through the matrix to find zeroes and mark the respective rows and
    // columns
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (matrix[row][col] == 0) {
          markRow(row, matrix);
          markCol(col, matrix);
        }
      }
    }

    // Update the marked cells to zero
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (matrix[row][col] == -1) {
          matrix[row][col] = 0;
        }
      }
    }
  }

  private static void markRow(int row, int[][] matrix) {
    for (int col = 0; col < matrix[row].length; col++) {
      if (matrix[row][col] != 0) {
        matrix[row][col] = -1;
      }
    }
  }

  private static void markCol(int col, int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      if (matrix[row][col] != 0) {
        matrix[row][col] = -1;
      }
    }
  }
}
