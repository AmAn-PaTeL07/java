class A {
    int a = 20;
    A(int a) {
        System.out.println("Local variable a: " + a);
        System.out.println("Global variable a: " + this.a);
    }
}

public class localnglobal {
    public static void main(String[] arr) {
        A cs = new A(100);   
        cs.A(100); // This line is incorrect and will cause a compilation error because the constructor cannot be called like a method. 
     }
}