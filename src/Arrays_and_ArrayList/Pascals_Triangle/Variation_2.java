package Arrays_and_ArrayList.Pascals_Triangle;

/*
 * Print any given row and coloumn of a pascals triangle n=5
 * 
 * T(C)- O(n)
 * S(C)- O(1)
 */

public class Variation_2 {
  public static void main(String[] args) {
    int n = 5;
    pascalsTriangle(n);
  }

  private static void pascalsTriangle(int n) {
    long ans = 1;
    System.out.print(ans + " ");

    for (int i = 1; i < n; i++) {
      ans = ans * (n - i);
      ans = ans / i;
      System.out.print(ans + " ");
    }
  }
}
