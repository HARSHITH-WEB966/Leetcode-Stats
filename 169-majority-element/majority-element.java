class Solution {
    public int majorityElement(int[] nums) {
        int c=0,el=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }
            else if(el==nums[i]) c++;
            else c--;
        }
        return el;
        // int c1=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==el) c1++;
        // }
        
    }
}







        // int m=0,store=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>m) m=nums[i];
        // }
        // int hash[]=new int[m+1];
        // for(int i=0;i<nums.length;i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=0;i<hash.length;i++){
        //     if(hash[i]>maxCount){
        //         maxCount=hash[i];
        //         store=i;
        //     }
        // }
        // return store;


        // int store=0;
        // for(int i=0;i<nums.length;i++){
        //     int c=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]) c++;
        //     }
        //     if(c>nums.length/2) store=nums[i];
        // } return store;