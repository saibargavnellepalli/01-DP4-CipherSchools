package Week2;

public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null)
            return null;

        if(key < root.val)
            root.left = deleteNode(root.left,key);

        else if(key > root.val)
            root.right = deleteNode(root.right,key);

        else{
            if(root.left == null && root.right == null){
                root = null;
                return null;
            }

            else if(root.left == null && root.right != null){
                root = root.right;
                return root;
            }

            else if(root.left != null && root.right == null){
                root = root.left;
                return root;
            }
            TreeNode subsNode = findMin(root.right);
            root.val = subsNode.val;

            root.right = deleteNode(root.right,subsNode.val);
        }

        return root;
    }
    private TreeNode findMin(TreeNode curr){
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}
