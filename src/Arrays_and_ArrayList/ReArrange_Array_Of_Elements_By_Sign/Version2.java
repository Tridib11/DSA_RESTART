package Arrays_and_ArrayList.ReArrange_Array_Of_Elements_By_Sign;

import java.util.ArrayList;
//https://www.naukri.com/code360/problems/alternate-numbers_6783445
public class Version2 {
    public static void main(String[] args) {

    }

    /*
     0 1 2 3  4 5
    -1,2,3,4,-3,1

    pos[]=2,3,4,1 size=4

    neg[]=-1,-3 size=2

    after rearanging

    2,-1,3,-3

     */

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
        if(positive.size()>negative.size()){

            for(int i=0;i<negative.size();i++){
                a[2*i]=positive.get(i);
                a[2*i+1]=negative.get(i);
            }
            int index=negative.size()*2;
            for(int i=negative.size();i<positive.size();i++){
                a[index]= positive.get(i);
                index++;
            }
        }else{
            for(int i=0;i<positive.size();i++){
                a[2*i]=positive.get(i);
                a[2*i+1]=negative.get(i);
            }
            int index=positive.size()*2;
            for(int i=positive.size();i<negative.size();i++){
                a[index]=negative.get(i);
                index++;
            }
        }
        return a;
    }
}
