package Arrays_and_ArrayList;
//https://www.geeksforgeeks.org/problems/rotation4723/1
public class Rotaion_Count {
    public static void main(String[] args) {
    int[] arr={5, 1, 2, 3, 4};
    System.out.println(findKRotation(arr,arr.length));
    }
    private static int findKRotation(int arr[], int n) {
        // code here
        int start=0,end=arr.length-1,min=Integer.MAX_VALUE,index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                if(arr[start]<min){
                    index=start;
                    min=arr[start];
                }
                start=mid+1;
            }
            else {
                end=mid-1;
                if(arr[mid]<min){
                    index=mid;
                    min=arr[mid];
                }

            }
        }
        return index;

    }
}
