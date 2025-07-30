import java.util.Scanner;

public class LongestConsecutiveSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int maxLen = 1, currLen = 1, start = 0, tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    start = tempStart;
                }
                currLen = 1;
                tempStart = i;
            }
        }

        if (currLen > maxLen) {
            maxLen = currLen;
            start = tempStart;
        }

        for (int i = start; i < start + maxLen; i++)
            System.out.print(arr[i] + " ");
    }
}
