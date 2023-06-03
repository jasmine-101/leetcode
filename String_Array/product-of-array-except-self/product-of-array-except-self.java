class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result=1;
        int n=nums.length;
        int left=1;
        int right=1;
        int[] answer=new int[n];

        for(int i=0;i<n;i++){
            answer[i]=left;
            left*=nums[i];
        }

        for(int i=n-1;i>=0;i--){
            answer[i]*=right;
            right*=nums[i];
        }
        return answer;
    }
}