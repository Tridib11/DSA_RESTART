package Arrays_and_ArrayList;

import java.util.Arrays;

public class TransPose_Of_A_Matrix {
    public static void main(String[] args) {
        int[][] arr={
                {1},
                {2},
                {3}
        };
        int[][] newarr=transpose(arr);


        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
    }




    private static int[][] transpose(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] result=new int[col][row];

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                result[i][j]=matrix[j][i];
            }
        }

        return result;


    }
}
