import java.util.Scanner;

public class JL11Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] numbers = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
