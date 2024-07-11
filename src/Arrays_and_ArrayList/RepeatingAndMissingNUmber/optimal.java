package Arrays_and_ArrayList.RepeatingAndMissingNUmber;

public class optimal {
    public static void main(String[] args) {

    }
    public int[] findTwoElement(int arr[], int n){
        long sN=n*(n+1)/2;
        long s2N=(n * (n + 1) * (2 * n + 1)) / 6;

        //calculating sum of the array
        int s=0,s2=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            s+=(long)arr[i]*(long)arr[i];
        }
    }
}
