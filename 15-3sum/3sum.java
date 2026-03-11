class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();

for (int a = 0; a < nums.length; a++){
    if (a!=0 && nums[a]==nums[a - 1]) {
        continue;
    }

    int b=a+1;
    int c=nums.length-1;

    while (b<c) {
        int sum = nums[a] + nums[b] + nums[c];
        if (sum == target){
            ArrayList<Integer> t = new ArrayList<>();
            t.add(nums[a]);
            t.add(nums[b]);
            t.add(nums[c]);
            ans.add(t);   // store in ans list

            b++;
            c--;

            while (b<c && nums[b]==nums[b - 1]){
                b++;
            }
            while (b<c && nums[c]==nums[c + 1]){
                c--;
            }
        }
        else if (sum<target){
            b++;
        }
        else {
            c--;
        }
    }
}
    return ans;
    }
}