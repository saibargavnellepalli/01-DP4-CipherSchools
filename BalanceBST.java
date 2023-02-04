package Week2;

import java.util.ArrayList;

public class BalanceBST {
    public TreeNode balanceBST(TreeNode root) {

        ArrayList<Integer> arr = new ArrayList<>();

        inorder(root,arr);

        return constructBalBST(0,arr.size()-1,arr);
    }

    //gives balanced BST
    private TreeNode constructBalBST( int start, int end, ArrayList<Integer> arr){

        if(start > end)
            return null;

        int mid = start+(end-start)/2;
        TreeNode newNode = new TreeNode(arr.get(mid));

        newNode.left = constructBalBST(start,mid-1,arr);
        newNode.right = constructBalBST(mid+1,end,arr);

        return newNode;

    }

    //gives inorder of bst (or) sorted array
    private void inorder(TreeNode root,  ArrayList<Integer> arr){

        if(root == null)
            return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}
