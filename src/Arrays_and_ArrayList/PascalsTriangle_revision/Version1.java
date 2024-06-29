package Arrays_and_ArrayList.PascalsTriangle_revision;

public class Version1 {
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalsTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }


    private static int pascalsTriangle(int r,int c){
        int ans=(int)nCr(r-1,c-1);
        return ans;
    }

    private static long nCr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}
