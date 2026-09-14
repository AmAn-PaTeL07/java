import java .util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements of the array in sorted order: ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        int mid = l/2;
        boolean found = false;

        if (key >= arr[mid]) {
            for (int i = mid; i < l; i++) {
                if (arr[i] == key) {
                    mid = i;
                    found = true;
                    break;
                }
            }
        } else {
            for (int i = 0; i < mid; i++) {
                if (arr[i] == key) {
                    mid = i;
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Element found at index: " + mid);
        } else {
            System.out.println("Element not found");
        }
    }
    }
    
}
