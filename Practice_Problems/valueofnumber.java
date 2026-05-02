import java.util.Scanner;
import java.lang.*;

public class valueofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n = sc.nextDouble();
        double Value = Math.pow(x, n);
        System.out.println(Value);
    }
}
