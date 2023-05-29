class Solution {
    public boolean canJump(int[] nums) {

        int max=0;
        int n=nums.length;

        for(int i=0;i<=max;i++){
            max=Math.max(max,i+nums[i]);
            if(max>=n-1){
                return true;
            }
        }
        return false;
    }
}