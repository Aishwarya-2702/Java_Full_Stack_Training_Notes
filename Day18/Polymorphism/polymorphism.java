package Day18.Polymorphism;

class geetha{
    void aishu(){
        System.out.println("Daughter");
    }
}
class abi{
    void aishu(){
        System.out.println("Friend");
    }
}
class harish{
    void aishu(){
        System.out.println("Student");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        geetha g = new geetha();
        abi a = new abi();
        harish h = new harish();
        g.aishu();
        a.aishu();
        h.aishu();
    }
}
