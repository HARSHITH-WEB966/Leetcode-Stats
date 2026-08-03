class Solution {
public:
    long long maxPairStrength(vector<int>& nums) {
        long long maxi=0;
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                long long g=gcd(nums[i],nums[j]);
                maxi=max(maxi,(1LL*nums[i]*nums[j])/(g*g));
            }
        }
        return maxi;
    }
};