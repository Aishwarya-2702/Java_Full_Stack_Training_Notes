package Day18.Polymorphism;

public class compile_time_polymorphism {
    public void add(int x, int y){// method declaration
        System.out.println(x+y);
    }
    public void add(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        compile_time_polymorphism cp = new compile_time_polymorphism(); // cp - instance reference
        cp.add(2, 3); // method call
        cp.add(2, 3, 4);
    }
}
