package Day18.Polymorphism;

class Main{
    void college(){
        System.out.println("IT");
    }
}
public class runtime_polymorphism extends Main{
    void college(){
        System.out.println("CSE");
    }
    public static void main(String[] args) {
        runtime_polymorphism rp = new runtime_polymorphism();
        rp.college();
    }
}
