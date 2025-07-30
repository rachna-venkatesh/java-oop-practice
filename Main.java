import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                String rev = new StringBuilder(sub).reverse().toString();
                if (!sub.equals(rev)) {
                    System.out.println(sub);
                }
            }
        }
        sc.close();
    }
}
