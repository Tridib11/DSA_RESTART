package Arrays_and_ArrayList;

public class Missing_number_optimal {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        System.out.println(xor1^xor2);
    }
}
