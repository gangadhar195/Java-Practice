class Solution {
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
}

// 62 leetcode
class Solution {
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
}

/// 198 leetcode house robber 1
///
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[2][n];

        dp[0][0] = nums[0];
        dp[1][0] = 0;

        for (int i = 1; i < n; i++) {
            dp[0][i] = nums[i] + dp[1][i - 1];
            dp[1][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
        }

        return Math.max(dp[0][n - 1], dp[1][n - 1]);
    }
}

// rober 2
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[2][n];

        if (n == 1) {
            return nums[0];
        }

        dp[0][0] = nums[0];
        dp[1][0] = 0;

        for (int i = 1; i < n - 1; i++) {
            dp[0][i] = nums[i] + dp[1][i - 1];
            dp[1][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
        }

        int rob_house_1 = Math.max(dp[0][n - 2], dp[1][n - 2]);

        dp[0][1] = nums[1];
        dp[1][1] = 0;

        for (int i = 2; i < n; i++) {
            dp[0][i] = nums[i] + dp[1][i - 1];
            dp[1][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
        }

        int rob_house_end = Math.max(dp[0][n - 1], dp[1][n - 1]);

        return Math.max(rob_house_1, rob_house_end);
    }
}