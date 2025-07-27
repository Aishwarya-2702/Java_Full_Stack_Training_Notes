package Day1;

// A new class is created
class CSE{
    public void dummy(){
        System.out.println("This is CSE class");
    }
}
public class classObject {
    public static void trainer(){
        System.out.println("This is CSE Trainer");
    }
    public static void main(String[] args) {
        //Object Creation
        CSE student = new CSE();
        CSE trainer = new CSE(); // We can use more than one object creation for single method
        student.dummy();
        trainer.dummy();
        trainer();
    }
}
