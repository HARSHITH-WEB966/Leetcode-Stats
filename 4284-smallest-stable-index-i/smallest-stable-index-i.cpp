class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int i=0,minimum,maxi;
        while(i<nums.size()){
             minimum=INT_MAX;
             maxi=INT_MIN;
            for(int s=0;s<=i;s++){
                maxi=max(maxi,nums[s]);
            }
            for(int s=i;s<=nums.size()-1;s++){
                minimum=min(minimum,nums[s]);
            }
            if(maxi-minimum<=k) return i;
            i++;
        }
        return -1;
    }
};