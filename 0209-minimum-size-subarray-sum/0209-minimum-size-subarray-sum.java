class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int c=0;
        int sum=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                max=Math.min(max,i-c+1);
                sum-=nums[c];
                c++;
            }
        }
        return max == Integer.MAX_VALUE ? 0 : max;
    }
}