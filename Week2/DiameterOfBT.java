package Week2;

class Solution {
    static int max = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
int a = checkForBalanced(root);
        return max;
    }
    public static int checkForBalanced(TreeNode root){
        if(root == null) return 0;

        int left = checkForBalanced(root.left);
        int right = checkForBalanced(root.right);

        max = Math.max(max,left+right);

        return 1+Math.max(left,right);
    }
}

public class DiameterOfBT {
    public static void main(String[] args) {
        TreeNode obj = new TreeNode(43);
        obj.left = new TreeNode(78);
        obj.right = new TreeNode(90);

    }
}
