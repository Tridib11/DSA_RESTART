package Arrays_and_ArrayList;

public class NextPermutation {
    public static void main(String[] args) {

    }

    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1){
            reverse(nums,0,nums.length-1);
        }


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
