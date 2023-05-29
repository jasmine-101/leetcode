class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int half=(n-1)/2;

        if(n==1){
            return nums[0];
        }

        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                count++;
            }else{
                count=1;
            }

            if(count>half){
                return nums[i];
            }
        }

        return -1;
    }
}