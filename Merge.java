import java.util.Scanner;

public class Merge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the third array: ");
        int n3 = scanner.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter " + n3 + " elements:");
        for (int i = 0; i < n3; i++) {
            arr3[i] = scanner.nextInt();
        }
        int maxLength = Math.max(n1, Math.max(n2, n3));

        System.out.println("Merged Output:");
        for (int i = 0; i < maxLength; i++) {
            if (i < n1) System.out.print(arr1[i] + ",");
            if (i < n2) System.out.print(arr2[i] + ",");
            if (i < n3) System.out.print(arr3[i] + ",");
        }

        scanner.close();
    }
}
