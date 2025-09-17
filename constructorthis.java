class A {
    A(){
        System.out.println("Learn something useless");
    }
    A(int a) {
        this();
        System.out.print(a);   
    }
}

public class constructorthis {
    public static void main(String[] arr) {
        A c = new A(100);    }
}