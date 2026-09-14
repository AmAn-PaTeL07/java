import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        int sum = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < l; i++) {
            arr[i] =sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
    
    
}
