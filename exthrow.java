import java.util.Scanner;
class ex{ 
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}    
public class exthrow {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = sc.nextInt();
    ex.validate(age);
    sc.close();
    }
}
