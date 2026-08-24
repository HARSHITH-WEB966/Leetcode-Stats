class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int p=0;
        for(int i=0;i<n;i++){
            arr[p]=nums[i];
            p+=2;
        }p=1;
        for(int j=n;j<2*n;j++){
            arr[p]=nums[j];
            p+=2;
        }
        return arr;
    }
}