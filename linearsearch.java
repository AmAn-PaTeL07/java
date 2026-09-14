import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is present in the array at position " + i + ".");
                c=1;
                break;
            }
        }
        if (c == 0) {
            System.out.println(target + " is not present in the array.");
        }
    }
    
}
