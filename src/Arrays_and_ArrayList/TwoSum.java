package Arrays_and_ArrayList;

import java.util.Arrays;

/*

Example 1

i      j
0 1 2  3
2 7 11 15 , target - 9


i+j = 15+2 = 17 (>9) decrease j

i   j
0 1 2  3
2 7 11 15 , target - 9

i+j = 11+2 = 13 (>9) decrease j

i j
0 1 2  3
2 7 11 15 , target - 9


i+j = 2+7 = 9 (=target) return the index (0,1)



Example 2


{3,2,4}  target = 6

i   j
0 1 2
3 2 4

i+j= 3+4 = 7 (>6) decrease j

i j
0 1 2
3 2 4

i+j = 3+2 = 4 (<6) increase i

  i
  j
0 1 2
3 2 4

i+j = 2+2=4(<6) increase i


  j i
0 1 2
3 2 4

i+j = 4+2 =6 (=target) return (1,2) or (2,1)

 */
public class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {

        int start=0,end=nums.length-1;
        boolean solution=false;
        while(!solution){
            int sum=nums[start]+nums[end];
            if(sum==target){
                solution=true;
                return new int[]{start,end};
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
