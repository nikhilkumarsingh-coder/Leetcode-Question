class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            int k=n-1;
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[k][i];
                k--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}