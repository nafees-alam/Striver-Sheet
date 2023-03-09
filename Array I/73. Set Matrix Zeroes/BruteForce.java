class Solution {
    public void setZeroes(int[][] matrix) {
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
                 if (matrix[i][j] == 0) {
                     set(matrix,i,j);
                 }
           }
       }
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
                 if (matrix[i][j] == -11) {
                     matrix[i][j] = 0;
                 }
           }
       }
    }
    static void set(int [][] matrix, int i, int j) {
        for (int l = 0; l < matrix.length; l++) {
                if (matrix[l][j] != 0) {
                   matrix[l][j] = -11;
                }
        }
        for (int l = 0; l < matrix[0].length; l++) {
                 if (matrix[i][l] != 0) {
                   matrix[i][l] = -11;
                }
        }
    }
}
