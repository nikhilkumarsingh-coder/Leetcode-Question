class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int j=1;j<110;j++){
            int z=0;
        for(int i=0;i<nums.length;i++){
            if(k*j==nums[i]){
                z=1;
                break;
            }
        }
        if(z==0){
            return k*j;
        }
        }
        return -1;
    }
}