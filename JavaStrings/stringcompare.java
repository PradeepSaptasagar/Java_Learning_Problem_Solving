import java.util.Scanner;

public class stringcompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
