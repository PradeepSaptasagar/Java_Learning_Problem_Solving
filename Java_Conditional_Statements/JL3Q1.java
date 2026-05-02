import java.util.*;

public class JL3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int calc = sc.nextInt();
        switch (calc) {
            case 1:
                System.out.println("Addition is:" + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is:" + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is:" + (a * b));
                break;
            case 4:
                System.out.println("Division is:" + (a / b));
                break;
            case 5:
                System.out.println("Modulo or Remainder is:" + (a % b));
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}
