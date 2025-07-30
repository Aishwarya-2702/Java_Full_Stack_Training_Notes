package Day18.ThreadConstructors;

public class constructorType2 extends Thread{
    public void run(){
        System.out.println("Message");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread("Aishu");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("Abi");
        System.out.println(t1.getName());
    }
}
