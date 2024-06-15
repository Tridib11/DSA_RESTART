package Arrays_and_ArrayList;

import java.util.*;

public class Union_of_two_Sorted_Arrays {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                    i++;
                }
            }
        }

    }
}
