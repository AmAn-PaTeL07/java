import java.util.*;

public class quicksort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int[] stack = new int[n * 2];
        int top = -1;
        int low = 0;
        int high = n - 1;

        stack[++top] = low;
        stack[++top] = high;

        while (top >= 0) {
            high = stack[top--];
            low = stack[top--];

            int pivot = numbers[high];
            int i = low;

            for (int j = low; j < high; j++) {
                if (numbers[j] <= pivot) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[high];
            numbers[high] = temp;

            if (low < i - 1) {
                stack[++top] = low;
                stack[++top] = i - 1;
            }

            if (i + 1 < high) {
                stack[++top] = i + 1;
                stack[++top] = high;
            }
        }

        System.out.println("Sorted array:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}

   