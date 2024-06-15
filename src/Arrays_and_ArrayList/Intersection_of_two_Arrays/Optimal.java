package Arrays_and_ArrayList.Intersection_of_two_Arrays;

public class Optimal {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{

            }
        }
    }
}
