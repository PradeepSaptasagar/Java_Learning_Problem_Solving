import java.util.Scanner;

public class JL7Q2 {
    public static int calculateEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateEvenOdd(n);
    }
}
