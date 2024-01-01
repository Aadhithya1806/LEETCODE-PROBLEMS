// Solution for problem 867.
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int[][] result = new int[colSize][rowSize];
        for (int i = 0; i < colSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                result[i][j] = matrix[j][i];
            }

        }
        return result;

    }

}