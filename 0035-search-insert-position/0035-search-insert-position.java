class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int x=left +(right-left)/2;
            if(nums[x]==target){
                return x;
            }
            else if(nums[x]>target){
                right=x-1;
            }
            else{
                left=x+1;
            }
        }
        return left;
    }
}