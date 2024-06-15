package Arrays_and_ArrayList.Intersection_of_two_Arrays;
import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        int[] arr1={1,2,3,3,4,5,6,7};
        int[] arr2={3,3,4,4,5,8};
        ArrayList<Integer> ans=intersection(arr1,arr2);
        for(int i:ans){
            System.out.print(i+" ");
        }

    }

    private static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> ans=new ArrayList<>();
        int[] visited=new int[arr2.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j] && visited[j]==0){
                    ans.add(arr2[j]);
                    visited[j]=1;
                    break;
                }
                else if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
        return ans;
    }
}
