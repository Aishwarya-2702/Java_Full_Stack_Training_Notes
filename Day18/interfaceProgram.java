package Day18;

interface mec1{
    void college();
    // abstract void college(); // we can use this line tooo
}
public class interfaceProgram implements mec1 {
    public void college(){
            System.out.println("Professional Students");
        }
    public static void main(String[] args) {
        interfaceProgram it = new interfaceProgram();
        it.college();
    }
}
