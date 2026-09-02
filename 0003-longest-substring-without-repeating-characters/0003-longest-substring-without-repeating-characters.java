class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] feq=new int[128];
       int left=0;
       int max=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        feq[ch]++;
        while(feq[ch]>1){
            feq[s.charAt(left)]--;
            left++;
        }
        max=Math.max(max,i-left+1);
       }
       return max;
    }
}