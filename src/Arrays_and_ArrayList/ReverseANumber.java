package Arrays_and_ArrayList;
//flipkart
public class ReverseANumber {
    public static void main(String[] args) {
        reverse(-321);
    }

    private static void reverse(int num){
        int rem=0;
        while(num!=0){
            int lastDigit=num%10;
            rem=rem*10+lastDigit;
            num=num/10;
        }
        System.out.println(rem);
    }
}
