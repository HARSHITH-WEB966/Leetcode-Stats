class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        List<List<Integer>> sol=new ArrayList<>();
        for(int i=lower;i<=upper;){
            if(set.contains(i)){
                i++; 
                continue;
            }
            int st=i;
            while(i<=upper && !set.contains(i)) i++;
            sol.add(Arrays.asList(st,i-1));
        }
        return sol;
    }
}