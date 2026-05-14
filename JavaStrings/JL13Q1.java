import java.util.Scanner;

public class JL13Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sb.append(sc.next());
        }
        System.out.println(sb.length());
    }
}
