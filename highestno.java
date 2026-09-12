import java.util.*;
public class highestno {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number : ");
        double c = scanner.nextDouble();

        double highest = a;
        if (b > highest) {
            highest = b;
        }
        if (c > highest) {
            highest = c;
        }

        System.out.println("The highest number is: " + highest);
    }
}
    

