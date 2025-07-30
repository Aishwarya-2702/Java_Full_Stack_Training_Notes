package Day18;

abstract class mec{ //abstract class
    void college(){
        System.out.println("mec");
    }
    abstract void rasipuram();// abstract method
}
public class abstraction extends mec{
    void rasipuram(){
        System.out.println("College");
    }
    public static void main(String[] args) {
        abstraction abs = new abstraction();
        abs.rasipuram();
        abs.college();
    }
}
