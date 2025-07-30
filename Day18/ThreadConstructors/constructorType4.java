package Day18.ThreadConstructors;

public class constructorType4 implements Runnable{
    public void run(){
        System.out.println("Message");
    }
    public static void main(String[] args) {
        constructorType4 c4 = new constructorType4();
        Thread t1 = new Thread(c4,"Geetha");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("aishu");
        System.out.println(t1.getName());
    }
}
