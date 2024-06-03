package Arrays_and_ArrayList;

public class Count_even_number_of_digits {
  public static void main(String[] args){
    int[] arr={12,345,2,6,7896};
    System.out.println(number_Of_Evens(arr));
  }

  private static int number_Of_Evens(int[] arr){
    int count=0;
    for(int num:arr){
      if(is_Even(num)){
        count++;
      }
    }
    return count;
  }

  private static boolean is_Even(int num) {
    int count = 0;
    while (num > 0) {
        count++;
        num = num / 10;
    }
    return (count % 2 == 0) ? true : false;
}

}

