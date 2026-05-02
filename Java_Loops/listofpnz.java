import java.util.Scanner;

public class listofpnz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int choice;
        do {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            if (a < 0) {
                negative++;
            } else if (a > 0) {
                positive++;
            } else {
                zero++;
            }

            System.out.print("Do you want to continue? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);
    }
}