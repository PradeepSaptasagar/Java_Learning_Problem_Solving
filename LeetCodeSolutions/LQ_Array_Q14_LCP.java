class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int n = strs.length;
        String ref1 = strs[0];
        for (int i = 0; i < ref1.length(); i++) {
            for (int j = 1; j < n; j++) {
                String current = strs[j];
                if (i >= current.length()) {
                    return result;
                }
                if (ref1.charAt(i) != current.charAt(i)) {
                    return result;
                }
            }
            result = result + ref1.charAt(i);
        }
        return result;
    }
}