class calc {
    int a, b, c;
    double ans;

    // Constructor
    calc(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ans = 0;
    }

    void sum() {
        ans = a + b + c;
        System.out.println("Sum is: " + ans);
    }

    void sub() {
        ans = a - b - c;
        System.out.println("Subtraction is: " + ans);
    }
}

public class constructor {
    public static void main(String args[]) {

        calc obj = new calc(10, 20, 30);

        obj.sum();
        obj.sub();
    }
}