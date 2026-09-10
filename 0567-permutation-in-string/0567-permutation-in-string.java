class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] s1feq=new int[26];
        int[] WS=new int[26];
        for(char ch:s1.toCharArray()){
            s1feq[ch-'a']++;
        }
        int k=s1.length();
        for(int i=0;i<k;i++){
            WS[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1feq,WS)){
            return true;
        }
        for(int i=k;i<s2.length();i++){
            WS[s2.charAt(i)-'a']++;
            WS[s2.charAt(i-k)-'a']--;
            if(Arrays.equals(s1feq,WS)){
                return true;
            }
        }
        return false;
    }
}