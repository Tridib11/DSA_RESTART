package Arrays_and_ArrayList;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {3,2,1}
        };
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth=Integer.MIN_VALUE;
        for(int rows=0;rows<accounts.length;rows++){
            int sum=0;
            for(int coloumns=0;coloumns<accounts[rows].length;coloumns++){
                sum+=accounts[rows][coloumns];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
}
