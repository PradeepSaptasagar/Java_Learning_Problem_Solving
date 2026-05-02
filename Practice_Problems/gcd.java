import java.util.Scanner;
import java.math.BigInteger;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = BigInteger.valueOf(b);
        BigInteger gcd = num1.gcd(num2);
        System.out.println(gcd);
    }
}
