class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        if(n==1){
            return nums[0];
        }
        
        int half = (n - 1) / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = nums[i];
            int value = map.getOrDefault(key, 0);
            if (value == half) {
                return key;
            }
            map.put(key,++value);
        }
        return -1;
    }
}