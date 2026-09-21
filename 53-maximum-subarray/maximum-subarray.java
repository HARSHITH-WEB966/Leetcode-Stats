class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0],ms=nums[0];
        int i=1;
        while(i<nums.length){
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(ms,cs);
            i++;
        } return ms;
    }
}