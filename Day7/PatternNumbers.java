package Day7;

public class PatternNumbers {
    public static void main(String[] args) {
        int n = 5;
        int m = (n/2) + 1;

        // to print number 0
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

        //to print number 1
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                if(j==m||i==n||(i==1&&j<=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print number 2
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i==1||i==m||i==n||(j==n&&i<=m)||(j==1&&i>=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print number 3
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||i==n||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print number 4
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==m||j==m||(j==1&&i<=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print number 5
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||i==n||(j==1&&i<=m)||(j==n&&i>=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print number 6
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||i==n||j==1||(j==n&&i>=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print number 7
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==m||i==m||(i==1&&j<=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //to print number 8
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

        //to print number 9
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==m||j==n||(j==1&&i<=m))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
