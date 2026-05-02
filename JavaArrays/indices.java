import java.util.Scanner;

public class indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] numbers = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + "," + j + ")");
                }
            }
        }
    }
}
