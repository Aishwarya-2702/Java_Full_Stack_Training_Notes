package Day7;

public class PatternAlphabet {
    public static void main(String[] args) {
        int n = 5;
        int m = (n/2)+1;

        //to print alphabet A
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||j==1||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet B
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||i==n||j==1||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet C
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet D
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet E
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||i==n||j==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet F
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||j==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet G
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||j==1||(i==n&&j<=m)||(j==m&&i>=m)||(i==m&&j>=m)||(j==n&&i>=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet H
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==m||j==1||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet I
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==n||j==m)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet J
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||j==m||(i==n&&j<=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print alphabet K
        for(int i=1; i<=n; i++){
            for(int j=1, k=5; j<=n; j++, k--){
                if(j==m||(i==k && j>=k))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
