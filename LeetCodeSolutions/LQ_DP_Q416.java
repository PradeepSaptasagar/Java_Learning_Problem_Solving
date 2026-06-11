class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int result = sum / 2;
        boolean[][] t = new boolean[n + 1][result + 1];
        for (int i = 0; i <= n; i++) {
            t[i][0] = true;
        }
        for (int j = 1; j <= result; j++) {
            t[0][j] = false;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= result; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][result];
    }
}
