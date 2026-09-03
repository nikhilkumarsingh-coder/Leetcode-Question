class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int smallodd=0;
        int i=0;
        while(i<nums1.length){
            if(nums1[i]%2!=0){
                smallodd=nums1[i];
                break;
            }
            i++;
        }
        for(int j=0;j<nums1.length;j++){
            if(nums1[j]%2==0){
                if(nums1[j]<smallodd){
                    return false;
                }
            }
        }
        return true;
    }
}