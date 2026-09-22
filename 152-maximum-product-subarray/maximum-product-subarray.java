class Solution {
    public int maxProduct(int[] nums) {
       int p=nums[0],q=nums[0],r=nums[0];

        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            if(x<0){
                int t=p;
                p=q;
                q=t;
            }
            p=Math.max(x,p*x);
            q=Math.min(x,q*x);
            r=Math.max(r,p);
        }
        return r;
    }
}