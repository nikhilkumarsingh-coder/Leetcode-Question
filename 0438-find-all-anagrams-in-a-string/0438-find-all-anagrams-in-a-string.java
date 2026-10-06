class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int[] ws=new int[26];
        int[] pf=new int[26];
        for(char ch:p.toCharArray()){
            pf[ch-'a']++;
        }
        for(int i=0;i<p.length();i++){
            ws[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pf,ws)){
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            ws[s.charAt(i)-'a']++;
            ws[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(pf,ws)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}