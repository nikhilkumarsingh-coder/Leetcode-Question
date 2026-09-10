class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int[] pfeq=new int[26];
        int[] WS=new int[26];
        for(char ch:p.toCharArray()){
            pfeq[ch-'a']++;
        }
        int k=p.length();
        for(int i=0;i<k;i++){
            WS[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pfeq,WS)){
            ans.add(0);
        }
        for(int i=k;i<s.length();i++){
            WS[s.charAt(i)-'a']++;
            WS[s.charAt(i-k)-'a']--;
            if(Arrays.equals(pfeq,WS)){
                ans.add(i-k+1);
            }
        }
        return ans;
    }
}