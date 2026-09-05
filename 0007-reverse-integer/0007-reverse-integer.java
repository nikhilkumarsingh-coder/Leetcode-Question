class Solution {
    public int reverse(int x) {
        int Reverse_int=0;
        while(x!=0){
          if( Reverse_int>Integer.MAX_VALUE/10 || Reverse_int<Integer.MIN_VALUE/10 )
            return 0;
             int digit=x%10;
           Reverse_int= Reverse_int*10+digit;
          x/=10;
        }
        return  Reverse_int;
    }
}