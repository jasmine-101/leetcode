class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt=1;
        int idx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                if(cnt<2){
                    nums[idx++]=nums[i];
                    cnt++;
                }
            }else{
                cnt=1;
                nums[idx++]=nums[i];
            }
        }
        return idx;
    }
}