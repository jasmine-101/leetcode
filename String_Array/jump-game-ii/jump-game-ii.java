class Solution {
    public int jump(int[] nums) {
        int max=0;
        int n=nums.length;
        int cur=0;
        int jump=0;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,i+nums[i]);

            if(cur==i){
                cur=max;
                jump++;
            }
        }
        return jump;
    }
}