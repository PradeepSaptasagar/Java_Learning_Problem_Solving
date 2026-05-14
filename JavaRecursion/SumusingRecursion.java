public class SumusingRecursion {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int sum = 0;
        printSum(1, 5, sum);
    }
}
