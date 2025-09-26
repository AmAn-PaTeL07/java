class M extends Thread  {
    //@overriding
    public void run(){
        for(int i=0;i<= 5;i++){
            System.out.println("yhyh");
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
    M a = new M();
    a.start();
    for(int i=0;i<= 5;i++){
            System.out.println("123");
    }
}
}