package Day18.ThreadConstructors;

public class constructorType3 implements Runnable{
    public void run(){
        System.out.println("Message");
    }
    public static void main(String[] args) {
        constructorType3 c3 = new constructorType3();
        Thread t1 = new Thread(c3);
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("Aishu");
        System.out.println(t1.getName());
    }
}