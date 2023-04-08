class Solution {
    public int differenceOfSum(int[] nums) {
         int ans=0;
        ans = sum(nums)-digits(nums);
        if(ans<0)
        {
            return ans*-1;
        }
        return ans;

    }
    int sum(int[] nums)
    {
        int sum1 =0;
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
        }
        return sum1;
    }
    int digits(int[] arr)
    {
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=9)
            {
                sum2 +=arr[i];

            }
            if(arr[i]>9) {
                sum2 += separate(arr[i]);
            }


        }

        return sum2;

    }
    int separate(int num)
    {
        int sum=0;

        while(num>0)
        {
            int val = num%10;
            sum+=val;
            num =num/10;
        }
        return sum;
        
    }
}