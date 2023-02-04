package Week2;

public class uniquePath {
    public void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }
    public int uniquePaths(int m, int n) {

        Integer[][] dp = new Integer[m][n];
        return f(m-1,n-1, dp);
    }
    public int f(int m, int n, Integer[][] dp){
        if(m<0 || n<0)
            return 0;



        if(m==0 && n==0)
            return 1;

        int down = f(m-1,n,dp);
        int right = f(m,n-1,dp);

        // dp[i][j] = down + right;

        return down + right;
    }
}
