package Arrays_and_ArrayList.Pascals_Triangle;

/*
 * Given Row and Coloumn tell me the element at R=5 and C=3 
 * T(c)- O(r)
 * S(c)- O(1)
 */

public class Variation_1 {

  public static void main(String[] args) {
    int r = 5; // row number
    int c = 3; // col number
    int element = pascalTriangle(r, c);
    System.out.println("The element at position (r,c) is: " + element);
  }

  private static int pascalTriangle(int r, int c) {
    int element = (int) nCr(r - 1, c - 1);
    return element;
  }

  private static long nCr(int n, int r) {
    long res = 1;
    for (int i = 0; i < r; i++) {
      res = res * (n - i);
      res = res / (i + 1);
    }
    return res;
  }
}
