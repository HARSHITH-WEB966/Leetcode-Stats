class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[]=new int[matrix.length];
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1) sum++;
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }
}