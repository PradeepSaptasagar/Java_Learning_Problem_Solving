public class stackheightn {
    public static int calPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xPownm1 = calPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2, n = 7;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
