import java.util.*;
class ZombieeAndHuman{
 
   
    static boolean isValid(int i, int j, int n, int m)
    {
        if (i < n && i >= 0 && j < m && j >= 0)
            return true;
        else
            return false;
    }
    static class pair {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
 
    static int zombieInfection(int[][] grid)
    {
 
        Queue<pair> q = new LinkedList<GFG.pair>();
 
        // Number of rows
        int n = grid.length;
 
        // Number of columns
        int m = grid[0].length;
 
        int cur = 0, next = 0;
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
 
                // If cell is zombie
                if (grid[i][j] == 1) {
                    q.add(new pair(i, j));
                    cur++;
                }
            }
        }
 
        int t = 0;
 
        // While any zombie is left
        while (!q.isEmpty()) {
            for (int i = 0; i < cur; i++) {
                pair use = q.peek();
                q.remove();
                int x = use.first, y = use.second;
 
                if (isValid(x + 1, y, n, m)
                    && grid[x + 1][y] == 0) {
                    grid[x + 1][y] = 1;
                    q.add(new pair(x + 1, y));
                    next++;
                }
                if (isValid(x - 1, y, n, m)
                    && grid[x - 1][y] == 0) {
                    grid[x - 1][y] = 1;
                    q.add(new pair(x - 1, y));
                    next++;
                }
                if (isValid(x, y + 1, n, m)
                    && grid[x][y + 1] == 0) {
                    grid[x][y + 1] = 1;
                    q.add(new pair(x, y + 1));
                    next++;
                }
                if (isValid(x, y - 1, n, m)
                    && grid[x][y - 1] == 0) {
                    grid[x][y - 1] = 1;
                    q.add(new pair(x, y - 1));
                    next++;
                }
            }
            if (next == 0)
                break;
            cur = next;
            next = 0;
 
            t++;
        }
 
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 0)
                    return -1;
 
        return t;
    }
 
    public static void main(String[] args)
    {
        int N = 3, M = 4;
 
        int[][] grid = { { 0, 1, 0, 1 },
                         { 0, 0, 0, 0 },
                         { 0, 0, 0, 1 } };
 
        // Function Call
        System.out.print(zombieInfection(grid));
    }
}