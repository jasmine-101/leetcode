class Solution {
    public boolean canJump(int[] nums) {

        int max=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            max=Math.max(max,i+nums[i]);
            System.out.println(max);
            if(max>=n-1){
                return true;
            }
            if(max==i){
                return false;
            }
        }
        return true;
    }
}