import java.util.*;
public class login {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        for (int i = 0; i < 4; i++) {
            if (username.equals("AmaN") && password.equals("password@123")) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
                if (i < 3) {
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                } else {
                    System.out.println("System locked out");
                }
            }
        }   
        }
    }
