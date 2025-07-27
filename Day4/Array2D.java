package Day4;

public class Array2D {
    public static void main(String[] args) {
        int student_marks[][] = new int[4][5];
        int Aishu = 1;
        int Vinu = 3;
        int java = 0, eng = 1, maths = 2, python = 3;
        student_marks[Aishu][0] = 100; // java
        student_marks[Aishu][1] = 56;  // eng 
        student_marks[Aishu][2] = 45;  // maths  
        student_marks[Aishu][3] = 80;  // python
        student_marks[Aishu][4] = 90;  // blabla.. 
        
        student_marks[Vinu][0] = 45; // java
        student_marks[Vinu][1] = 56;  // eng 
        student_marks[Vinu][2] = 78;  // maths  
        student_marks[Vinu][3] = 12;  // python
        student_marks[Vinu][4] = 91;  // blabla.. 
        System.out.println(student_marks[Vinu][maths]);
        System.out.println(student_marks[Vinu][java]);
        System.out.println(student_marks[Vinu][eng]);
        System.out.println(student_marks[Vinu][python]);
    }
}
