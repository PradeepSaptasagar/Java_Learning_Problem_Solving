import java.util.Scanner;

public class JL7Q3 {
    public static void calculateTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table of number is: " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateTable(n);
    }
}
