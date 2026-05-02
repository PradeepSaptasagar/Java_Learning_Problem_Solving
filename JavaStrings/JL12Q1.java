import java.util.Scanner;

public class JL12Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        String[] input = new String[str];
        int sum = 0;
        for (int i = 0; i < str; i++) {
            input[i] = sc.next();
            sum += input[i].length();
        }
        System.out.println(sum);
    }
}
