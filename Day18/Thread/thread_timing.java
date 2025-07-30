package Day18.Thread;

public class thread_timing {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        thread_timing tm = new thread_timing();
        tm.run();
    }
}
