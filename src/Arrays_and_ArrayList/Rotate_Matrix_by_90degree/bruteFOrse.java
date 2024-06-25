package Arrays_and_ArrayList.Rotate_Matrix_by_90degree;
//https://leetcode.com/problems/rotate-image/description/

//T = O(n^2)
//S = O(n^2)
public class bruteFOrse {
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rotated[][] = rotateMatrix(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }


    private static int[][] rotateMatrix(int[][] matrix){
        int n=matrix.length;
        int[][] rotated=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=rotated[i][j];
            }
        }
        return rotated;
    }
}
