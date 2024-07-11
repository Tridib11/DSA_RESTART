package Arrays_and_ArrayList.RepeatingAndMissingNUmber;
//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
public class BruteForce {
    public static void main(String[] args) {

    }
    int[] findTwoElement(int arr[], int n) {
        // code here
        int repeating=-1;
        int missing=-1;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++ ){
                if(arr[j]==i){
                    count++;
                }
            }
            if(count==2) repeating=i;
            else if(count==0) missing=i;

            if(repeating!=-1 && missing!=-1){
                break;
            }
        }
        return new int[]{repeating,missing};

    }
}
