package Week2;

public class isFullBT {
    static boolean ans = true;
    public static void main(String[] args) {
        TreeNode obj = new TreeNode(90);
        obj.left = new TreeNode(93);
        obj.right = new TreeNode(78);
        obj.right.right = new TreeNode(23);

        System.out.println(ans);
    }

    public void isFull(TreeNode root){
        if(root == null) return;

        if(root.left == null && root.right != null )
        {
            ans = false;
        }
        if(root.right == null && root.left != null)
        {
            ans = false;
        }

        isFull(root.left);
        isFull(root.right);

        return;

    }
}
