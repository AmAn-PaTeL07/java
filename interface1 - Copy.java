import java.util.Scanner;
interface info {
    String name();
    int age();
    int salary();
}
class Employee implements info {
    String name;
    int age;
    int salary;
    Scanner sc = new Scanner(System.in);

    @Override
    public String name() {
        System.out.println("Enter Name:");
        name = sc.nextLine();
        return name;
    }

    @Override
    public int age() {
        System.out.println("Enter Age:");
        age = sc.nextInt();
        return age;
    }

    @Override
    public int salary() {
        System.out.println("Enter Salary:");
        salary = sc.nextInt();
        return salary;
    }

}

public class interface1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Name: " + emp.name());
        System.out.println("Age: " + emp.age());
        System.out.println("Salary: " + emp.salary());
    }

}
