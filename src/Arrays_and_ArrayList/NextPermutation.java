package Arrays_and_ArrayList;
//https://leetcode.com/problems/next-permutation/
public class NextPermutation {
    public static void main(String[] args) {

    }

    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }

        }
        reverse(nums,index+1,nums.length-1);

    }

    private void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
