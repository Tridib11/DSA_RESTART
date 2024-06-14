package Arrays_and_ArrayList;
//https://leetcode.com/problems/single-number/description/
public class SIngleNumber {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor=xor^i;
        }
        return xor;
    }
}
