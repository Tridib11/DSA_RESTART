package Arrays_and_ArrayList.Longest_Subsequesnce;
import java.util.*;
public class Optimal {

    public static void main(String[] args) {


    }

    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set=new HashSet<>();

        for(int i:a){
            set.add(i);
        }

        for(int i:a){
            if(!set.contains(i-1)){
                int count=1;
                int current=i;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
