class Solution {
    public int maxProduct(int[] nums) {
        int lar=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int max=(nums[i]-1)*(nums[j]-1);
                if(max>lar){
                    lar=max;
                }
            }
        }
        return lar;
    }
}