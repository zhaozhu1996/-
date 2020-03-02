public class UniquePaths63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0||obstacleGrid[0][0]==1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {
            if(obstacleGrid[i][0]==1){
                map[i][0] = 0;
                break;
            }else {
                map[i][0] = 1;
            }
        }
        for (int j = 0; j < n; j++) {
            if(obstacleGrid[0][j]==1) {
                map[0][j] = 0;
                break;
            }else {
                map[0][j] = 1;
            }

        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j]==1||(obstacleGrid[i-1][j]==1&&obstacleGrid[i][j-1]==1)) {
                    map[i][j] = 0;
                }else if(obstacleGrid[i-1][j]==1||obstacleGrid[i][j-1]==1){
                    if(obstacleGrid[i-1][j]==1) map[i][j] = map[i][j-1];
                    if(obstacleGrid[i][j-1]==1) map[i][j] = map[i-1][j];
                }else {
                    map[i][j] = map[i-1][j]+map[i][j-1];
                }
            }
        }
        return map[m-1][n-1];

    }


    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0},{1,1},{0,0}}));
    }
}
