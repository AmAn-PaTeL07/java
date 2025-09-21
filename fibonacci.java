import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}