package Arrays_and_ArrayList.Set_Matrix_Zero;
//https://leetcode.com/problems/set-matrix-zeroes/description/

/*
 
Time Complexity: O(2*(N*M)), 

where N = no. of rows in the matrix and M = no. of columns in the matrix.
Reason: In this approach, we are also traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

Space Complexity: O(1) as we are not using any extra space.
  
  
 */
public class Optimal {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        setZeroes(matrix);
        for (int[] row : matrix) {
            for (int num : row) {   
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int flagFirstRow = 1;
        int flagFirstCol = 1;

        // Check if the first row has any zero
        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                flagFirstRow = 0;
                break;
            }
        }

        // Check if the first column has any zero
        for (int j = 0; j < row; j++) {
            if (matrix[j][0] == 0) {
                flagFirstCol = 0;
                break;
            }
        }

        // Mark zeros in the first row and column based on inner matrix zeros
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0; // Mark the corresponding first row
                    matrix[i][0] = 0; // Mark the corresponding first column
                }
            }
        }

        // Zero out rows based on marks in the first column
        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out columns based on marks in the first row
        for (int j = 1; j < col; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the first row if needed
        if (flagFirstRow == 0) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        // Zero out the first column if needed
        if (flagFirstCol == 0) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
