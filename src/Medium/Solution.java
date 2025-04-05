package Medium;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isFirstRow = false;
        boolean isFirstCol = false;

        //first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                isFirstRow = true;
            }
        }

        //first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isFirstCol = true;
            }
        }

        //rest
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (isFirstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
        solution.setZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
