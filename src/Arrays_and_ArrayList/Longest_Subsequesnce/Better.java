package Arrays_and_ArrayList.Longest_Subsequesnce;
import java.util.*;
public class Better {
    public static void main(String[] args) {
        int[] a={100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(longestSuccessiveElements(a));

    }
    public static int longestSuccessiveElements(int []a) {

        // Write your code here.
        Arrays.sort(a);

        int count_current=1,longest=1,last_smaller=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]-1==last_smaller){
                count_current++;
                last_smaller=a[i];
            }
            if(a[i]!=last_smaller){
                count_current=1;
                last_smaller=a[i];
            }
            longest=Math.max(count_current, longest);
        }
        return longest;
    }
}
