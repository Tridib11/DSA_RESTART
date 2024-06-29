package Arrays_and_ArrayList.PascalsTriangle_revision;
//print the entire row
public class Version2 {
    public static void main(String[] args) {
        int n=5;
        pascalsTriangle(n);
    }

    private static void pascalsTriangle(int n){
        long ans=1;
        System.out.print(ans+" ");
        for(int col=1;col<n;col++){
            ans=ans*(n-col);
            ans=ans/col;
            System.out.print(ans+" ");
        }
        System.out.println();

    }
}
