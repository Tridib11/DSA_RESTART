package Arrays_and_ArrayList;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Find_the_number_with_Even_number_of_digits {

    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        int ans=findNumbers(arr);
        System.out.println(ans);
    }

    public static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int num){
        if(num<0){
            num=num*-1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count % 2 == 0;
    }
}


