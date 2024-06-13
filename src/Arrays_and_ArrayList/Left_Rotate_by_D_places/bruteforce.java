package Arrays_and_ArrayList.Left_Rotate_by_D_places;

import java.util.Arrays;

public class bruteforce {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=3;

        System.out.println(Arrays.toString(rotate(arr,n,d)));
    }

    private static int[] rotate(int[] arr,int n,int d){
        d=d%n;
        int[] temp=new int[d];

    }
}
