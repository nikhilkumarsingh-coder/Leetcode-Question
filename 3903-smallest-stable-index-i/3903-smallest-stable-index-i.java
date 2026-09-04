class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] arr=new int[nums.length];
        int mn=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            mn=Math.min(mn,nums[i]);
            arr[i]=mn;
        }
        int mx=0;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            int score=mx-arr[i];
            if(score<=k){
                return i;
            }
        }
        return -1;
    }
}