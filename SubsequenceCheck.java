import java.util.Scanner;
public class SubsequenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(); 
        String t = sc.nextLine(); 

        if (isSubsequence(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == t.length();
    }
}
