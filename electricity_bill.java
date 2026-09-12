// first 100 units = 0 per unit
// next 100-200 units = 7 per unit
// next 200-300 units = 9 per unit
// next 300-400 units = 12 per unit
// above 400 units = 15 per unit
import java.util.*;
public class electricity_bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units used: ");
        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = 0;
        } else if (units <= 200) {
            bill = (units - 100) * 7;
        } else if (units <= 300) {
            bill = (100 * 7) + (units - 200) * 9;
        } else if (units <= 400) {
            bill = (100 * 7) + (100 * 9) + (units - 300) * 12;
        } else {
            bill = (100 * 7) + (100 * 9) + (100 * 12) + (units - 400) * 15;
        }

        System.out.println("Total electricity bill: " + bill);
    }
}