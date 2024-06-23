package Arrays_and_ArrayList;
import java.util.*;
public class Leaders_in_an_Array {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
            }
            max=Math.max(arr[i],max);
        }
        Collections.reverse(ans);
        return ans;
    }
}
