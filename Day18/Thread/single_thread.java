package Day18.Thread;

public class single_thread extends Thread {
    public void run(){
        System.out.println("Hi - "+single_thread.currentThread().getId());
        System.out.println("Aishu - "+single_thread.currentThread().getId());
        System.out.println("Welcome - "+single_thread.currentThread().getId());
    }
    public static void main(String[] args) {
        for(int i=0; i<=3; i++){
            single_thread st = new single_thread();
            st.run(); // for single thread we given as run // safe, less efficient
            st.start(); // for multi thread it prints in random way // unsafe, efficient
        } 
    }
}
