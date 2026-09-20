class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int x=(int) ch;
            sum=sum+(26-(x-97))*(i+1);
        }
        return sum;
    }
}