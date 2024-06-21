package Arrays_and_ArrayList.ReArrange_Array_Of_Elements_By_Sign;

import java.util.ArrayList;

public class Version2 {
    public static void main(String[] args) {

    }

    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for(int i: a){
            if(i>0){
                positive.add(i);
            }
            else{
                negative.add(i);
            }
        }


    }
}
