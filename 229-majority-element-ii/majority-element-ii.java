class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
         List<Integer> res=new ArrayList<>();
        
        for(int i=0; i<n;i++){
            if(res.size() == 0 || res.get(0) != nums[i]){
                
                int c=0;
                
                for(int j = 0; j < n; j++){
                    // counting the frequency of nums[i]
                    if (nums[j] == nums[i]) {
                        c++;
                    }
                }
            
                if(c>n/3){
                    res.add(nums[i]);
                }
            }
            if (res.size() == 2) {
                break;
            }
        }
        return res;
    }
}