package HashMaps.Majority_Element;
//https://leetcode.com/problems/majority-element/
public class Optimal {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int count=0;
        Integer majorityElement=null;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                majorityElement=nums[i];
                count=1;
            }
            else if(nums[i]==majorityElement){
                count++;
            }
            else{
                count--;
            }
        }
        return majorityElement;
    }
}
