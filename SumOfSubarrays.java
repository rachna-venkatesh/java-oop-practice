import java.util.Scanner;

public class SumOfSubarrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the subarray length: ");
        int size = scanner.nextInt();

        if (size > n || size <= 0) {
            System.out.println("Invalid subarray length.");
        } else {
            System.out.println("Sum of each subarray of length " + size + ":");
            for (int i = 0; i <= n - size; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                System.out.println("Subarray starting at index " + i + ": Sum = " + sum);
            }
        }
        scanner.close();
    }
}
