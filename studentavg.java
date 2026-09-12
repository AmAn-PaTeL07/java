import java.util.Scanner;
public class studentavg {
    public static void main(String[] args)
    {
        int a,b,c;
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter student name");
        name = sc.nextLine();
        System.out.println("Enter first subject marks:");
        a=sc.nextInt();
        System.out.println("Enter second subject marks:");
        b=sc.nextInt();
        System.out.println("Enter third subject marks:");
        c=sc.nextInt();
        int total = a+b+c;
        System.out.println("Average of "+name+" is:"+ (double)(total)/3);
    }
    
}