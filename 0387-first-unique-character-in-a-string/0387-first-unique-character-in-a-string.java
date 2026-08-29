class Solution {
    public int firstUniqChar(String s) {
        int[] feq=new int[128];
        for(char ch:s.toCharArray()){
            feq[ch]++;
        }
        for(int i=0;i<s.length();i++){
            if(feq[s.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}