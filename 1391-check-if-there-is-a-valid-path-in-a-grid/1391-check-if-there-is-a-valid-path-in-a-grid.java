class Solution {

    int m, n;

    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};

    int[][] directions = {
        {},
        {1, 3}, // 1: right, left
        {0, 2}, // 2: up, down
        {3, 2}, // 3: left, down
        {1, 2}, // 4: right, down
        {3, 0}, // 5: left, up
        {1, 0}  // 6: right, up
    };

    public boolean hasValidPath(int[][] grid) {

        m = grid.length;
        n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        return dfs(grid, 0, 0, visited);
    }

    private boolean dfs(int[][] grid, int r, int c,
                        boolean[][] visited) {

        // Destination reached
        if (r == m - 1 && c == n - 1) {
            return true;
        }

        visited[r][c] = true;

        int type = grid[r][c];

        // Check all possible directions of current street
        for (int dir : directions[type]) {

            int nr = r + dr[dir];
            int nc = c + dc[dir];

            // Check boundary
            if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                continue;
            }

            // Already visited
            if (visited[nr][nc]) {
                continue;
            }

            // Check whether neighbor connects back
            int opposite = (dir + 2) % 4;

            boolean connected = false;

            for (int nextDir : directions[grid[nr][nc]]) {
                if (nextDir == opposite) {
                    connected = true;
                    break;
                }
            }

            if (connected) {
                if (dfs(grid, nr, nc, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}