package Day18.Thread;

public class multi_thread extends Thread{
    public void run(){
        System.out.println("Hi - "+multi_thread.currentThread().getId());
        System.out.println("Aishu - "+multi_thread.currentThread().getId());
        System.out.println("Welcome - "+multi_thread.currentThread().getId());
    }
    public static void main(String[] args) {
        for(int i=0; i<=3; i++){
            multi_thread mt = new multi_thread();
            mt.start();
            try{
                mt.join();// it avoids the entry of simultaneous thread
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
