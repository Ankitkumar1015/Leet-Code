class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        List<Integer> list = new ArrayList<>();

        // mark which numbers are present
        for (int x : nums) {
            seen[x] = true;
        }

        // collect missing numbers
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) list.add(i);
        }

        return list;
    }
}
