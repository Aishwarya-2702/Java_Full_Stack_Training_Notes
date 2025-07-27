package Day4;

public class LeastMissingNumber {
    public static void main(String[] args) {
        int a[] = {3,2,1,5,4,7};
        int given_sum = 0;
        for(int i = 0; i<a.length; i++){
            given_sum = given_sum+a[i];
        }
        int n = a.length+1;
        int total_sum = n*(n+1)/2;
        System.out.println(total_sum-given_sum);
    }
}