import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter the substring to find (s2): ");
        String s2 = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index++; 
        }
        System.out.println(count);
    }
}
