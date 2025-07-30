import java.util.Scanner;

public class ConsecutiveSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nAll Consecutive Subarrays:");
        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();  
            }
        }
        sc.close();
    }
}
