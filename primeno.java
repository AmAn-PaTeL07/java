import java.util.*;

public class primeno {

    public static void main(String[] args) {

        Scanner sac = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int num = sac.nextInt();

        System.out.println("All the prime numbers till " + num + " are:");

        for (int i = 2; i <= num; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}