import java.util.Scanner;

public class LongPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 3; j < n; j++) {  
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
