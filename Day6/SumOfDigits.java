package Day6;

public class SumOfDigits {
    public static int sum_of_digits(int n)
    {
        int sum = 0;
        for( ;n>0 ; )
        {
            sum = sum + (n%10); n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int day = 65;
        System.out.println(sum_of_digits(day));
    }
}
