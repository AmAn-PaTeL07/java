class A {
    int a = 20;
    A(int a) {
        System.out.println("Local variable a: " + a);
        System.out.println("Global variable a: " + this.a);
    }
}

public class localnglobal {
    public static void main(String[] arr) {
        A c = new A(100);    }
}