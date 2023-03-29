class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int fou =0;
        for(int j:nums){
            fou = fou ^ j;
        }
        return fou;
    }
};