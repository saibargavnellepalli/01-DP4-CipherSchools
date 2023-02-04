package Week2;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val = val;
    }
}

class Depth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }
}

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode obj =  new TreeNode(23);
        obj.left = new TreeNode(34);
        obj.right = new TreeNode(89);
    }
}
