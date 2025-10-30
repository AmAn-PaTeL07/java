class A extends Thread {
    public void run() {
        for(int i=0; i<=5; i++) {
            System.out.println("Thread A is running");
            try {
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
        }
        
    }
}
public class thread2 {
    public static void main(String[] args) {
        A threadA = new A();
        threadA.start();
        }
    }