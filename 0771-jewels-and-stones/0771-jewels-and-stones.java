class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] feq=new boolean[128];
        for(char ch: jewels.toCharArray()){
            feq[ch]=true;
        }
        int c=0;
        for(char ch: stones.toCharArray()){
            if(feq[ch]){
                c++;
            }
        }
        return c;
    }
}