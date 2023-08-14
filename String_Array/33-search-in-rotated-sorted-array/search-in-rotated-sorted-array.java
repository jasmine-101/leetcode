class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;



        while(left<= right){
            if(target==nums[left]){
                return left;
            }
            if(target==nums[right]){
                return right;
            }
            int mid=left +(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if((nums[mid]>target&&(nums[left]>nums[mid]||nums[left]<target))||(nums[mid]<target&&(nums[left]>nums[mid]&&nums[right]<target))){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return -1;

    }
}