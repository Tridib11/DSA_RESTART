package Arrays_and_ArrayList.RepeatingAndMissingNUmber;

public class LeetCode_Better {
    public static void main(String[] args) {

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] hash=new int[n*n+1];
        int repeating=-1;
        int missing=-1;
        //couting the ocurences of the array and storing them in the hashArray

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                hash[grid[i][j]]++;
            }
        }

        for(int i=1;i<=hash.length;i++){
            if(hash[i]==2){
                repeating=i;
            }else if(hash[i]==0){
                missing=i;
            }

            if(repeating!=-1 && missing !=-1){
                break;
            }
        }
        return new int[]{repeating,missing};
    }
}
