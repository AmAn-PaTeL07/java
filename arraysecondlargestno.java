import java.util.Scanner;
public class arraysecondlargestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < l; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
           
            }
        }
        System.out.println("Second largest number in the array is: " + secondLargest);
    }
}