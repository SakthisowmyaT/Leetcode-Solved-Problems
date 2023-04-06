class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rem =0;
        int reverse =0;
        while(n>0)
        {
            rem = n%10;
            reverse = (reverse*10)+rem;
            n=n/10;
        }
        if(x==reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}