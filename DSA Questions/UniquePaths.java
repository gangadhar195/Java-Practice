public class UniquePaths {

     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int numWays = helper(0, 0, m, n, obstacleGrid, dp);

        return numWays;
    }

    public int helper(int x, int y, int m, int n, int[][] obstacleGrid, int[][] dp) {
        if (obstacleGrid[x][y] == 1) {
            return 0;
        }

        if (x == m - 1 && y == n - 1) {
            return 1;
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        int right = 0;
        int down = 0;

        if (x < m - 1) {
            right = helper(x + 1, y, m, n, obstacleGrid, dp);
        }
        if (y < n - 1) {
            down = helper(x, y + 1, m, n, obstacleGrid, dp);
        }

        dp[x][y] = right + down;

        return dp[x][y];
    }
    public static void main(String args[]){
            int[][] obstacleGrid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
            };
            uniquePathsWithObstacles(obstacleGrid);
    }
}
