package Week2;

public class DistributeCoins_28 {

    int ans = 0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int req = root.val+left+right-1;
        ans += Math.abs(req);
        root.val = 1;
        return req;
    }
}