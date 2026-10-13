class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        long sum=0;
        while(l<r){
            sum=sum+((long)nums[r]*nums[r])-((long)nums[l]*nums[l]);
            l++;
            r--;
        }
        if(nums.length%2!=0){
            sum=sum+((long)nums[l]*nums[l]);
        }
        return sum;
    }
}