import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        long binary = 0;
        long place = 1;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + remainder * place;
            decimal = decimal / 2;
            place = place * 10;
        }
        System.out.println("Binary equivalent: " + binary);
    }
}