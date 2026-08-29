class Solution {
    public boolean isAnagram(String s, String t) {
        int[] feq=new int[128];
        for(char ch:s.toCharArray()){
            feq[ch]++;
        }
        for(char ch:t.toCharArray()){
            feq[ch]--;
        }
        for(int count:feq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}