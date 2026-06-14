class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int currElem = Math.abs(nums[i]);
            int index = currElem - 1;
            if (nums[index] < 0) {
                result.add(currElem);
            } else {
                nums[index] = nums[index] * (-1);
            }
        }
        return result;
    }
}