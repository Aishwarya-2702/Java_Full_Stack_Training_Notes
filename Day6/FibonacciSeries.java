package Day6;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for(int i =1; i<=n; i++){
            n3 = n1+n2;
            System.out.println(n2+" ");
            n1 = n2;
            n2 = n3;
        }
    }
}
