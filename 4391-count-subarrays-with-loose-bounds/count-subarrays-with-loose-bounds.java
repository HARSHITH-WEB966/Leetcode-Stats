class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long a=0,l=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK)  l=i;
             else a+=i-l;
        } return a;
    }
}