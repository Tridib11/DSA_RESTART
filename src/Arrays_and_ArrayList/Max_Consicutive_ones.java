package Arrays_and_ArrayList;

public class Max_Consicutive_ones {
    public static void main(String[] args) {
            int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsicutive=0,consicutive=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                consicutive+=1;
                if(maxConsicutive<=consicutive){
                    maxConsicutive=consicutive;
                }
            }
            else{
                consicutive=0;
            }

        }
        return maxConsicutive;
    }
}
