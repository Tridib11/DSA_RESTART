package Arrays_and_ArrayList;

public class MIssing_number {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int actualSum=(n*(n+1))/2;

        int ans=actualSum-sum;
        return ans;
    }

}
