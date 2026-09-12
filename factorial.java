public class factorial {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println("Factorial of " + i + " is: " + factorial(i));
            i++;
        }
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}