package Day2;

public class Datatype {
    public static void main(String[] args) {
        System.out.println("2"+3);//String + int = Concatenation
        System.out.println("i"+2+3);// String + int + int = Concatenation
        System.out.println("i"+(int)2+(int)3);
        System.out.println("i"+(2+3));// Bracket is important 
        
        //Letters replaced by following letters
        System.out.println("Batman\rAishuu");

        // Back Space(it overwrites the last letter)
        System.out.println("Help\bppppuuuu");

        // To print \n in output
        System.out.println("\\n");

        // To print %d in output
        System.out.printf("%%d\n"); //format specifier

        //Usage of \t --> TabSpace
        System.out.println("Hello\tAishu");

        //Usage of space between the unary changes the meaning to arithmetic operation
        System.out.println(- -5);

        //Usage of unary operator
        int a = 5;
        System.out.println(a++ + ++a);

        //Sum of all Natural Numbers
        int n = 10;
        System.out.println(n*(n+1)/2);

        //Sum of all Odd Numbers
        System.out.println(n*n);

        //Sum of all Even Numbers
        System.out.println((n*n)+n);
    }
}
