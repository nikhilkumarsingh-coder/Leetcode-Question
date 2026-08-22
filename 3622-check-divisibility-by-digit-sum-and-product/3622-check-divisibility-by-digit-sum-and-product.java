class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pt=1;
        int x=n;
        while(n!=0){
            sum+=n%10;
            pt=pt*(n%10);
            n=n/10;
        }
        return x%(sum+pt) == 0;
    }
}