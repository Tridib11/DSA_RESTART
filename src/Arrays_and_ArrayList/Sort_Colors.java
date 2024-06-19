package Arrays_and_ArrayList;
//https://leetcode.com/problems/sort-colors/description/
public class Sort_Colors {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int i=0; //denotes 0
        int j=0; //denotes 1
        int k=nums.length-1; //denotes 2

        while(j<=k){
            if(nums[j]==1){
                j++;
            }else if(nums[j]==2){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k--;
            }else{//nums[j]==0
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
        }
    }
}
