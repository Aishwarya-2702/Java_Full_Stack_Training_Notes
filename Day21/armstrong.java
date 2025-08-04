package Day21;

import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans=0;
        for(int i=n;i!=0;ans=ans+(int)Math.pow(i%10, ((int)Math.log10(n)+1)),i=i/10);
		System.out.println((ans==n)?("yes"):("no"));
    }
}