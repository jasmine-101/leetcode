class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        for(int i=1;i<nums.length;i++){
            while(i<nums.length&&nums[i-1]==nums[i]){
                i++;
            }
            if(i==nums.length){
                break;
            }
            nums[idx++]=nums[i];
        }

        return idx;
    }
}