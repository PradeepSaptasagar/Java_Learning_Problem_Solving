import java.util.Scanner;

public class averageQ1 {
    public static double calculateAverage(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double average = calculateAverage(a, b, c);
        System.out.println("Average of 3 nos is: " + average);
    }
}
