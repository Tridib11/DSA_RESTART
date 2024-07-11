package Arrays_and_ArrayList.RepeatingAndMissingNUmber;
//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
//https://leetcode.com/problems/find-missing-and-repeated-values/
public class Better {
    public static void main(String[] args) {

    }
    int[] findTwoElement(int arr[], int n){
        int repeating=-1;
        int missing=-1;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==2){
                repeating=i;
            }else if(hash[i]==0){
                missing=i;
            }
            if(repeating!=-1 && missing!=-1){
                break;
            }
        }
        return new int[]{repeating,missing};
    }
}
