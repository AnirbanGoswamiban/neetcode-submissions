class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        if (!set.contains(1)) {
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size() - 1; i++) {

            int curr = list.get(i);
            int next = list.get(i + 1);

            if (next != curr + 1) {
                return curr + 1;
            }
        }
        return list.get(list.size() - 1) + 1;
    }
}
