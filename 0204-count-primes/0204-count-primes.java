class Solution {
    public int countPrimes(int n) {
        boolean b[] = new boolean[n];
        int count =0;
        for(int i=0;i<n;i++)
        {
            b[i] =true;
        }
        for(int p=2;p*p<n;p++)
        {
            if(b[p]==true)
            {
                for(int i=p*p;i<n;i+=p)
                {
                    b[i]=false;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(b[i]==true)
            {
                if(i==0 ||i==1)
                {
                    count=0;
                }
                else
                {
                    count++;
                }
            }
        }
        return count;
    }
}