class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] arr = new int[n];


        for (int from = 0; from < n; from++) {
            int to = (from + k) % n;
            arr[to] = nums[from];
        }

        System.arraycopy(arr, 0, nums, 0, n);
    }
}