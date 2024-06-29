package Arrays_and_ArrayList;

public class ReverseANumber {
    public static void main(String[] args) {

    }

    private static void reverse(int num){
        int rem=0;
        while(num!=0){
            int lastDigit=num%10;
            rem=rem*10+lastDigit;
            num=num/10;
        }
    }
}
