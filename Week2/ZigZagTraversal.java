package Week2;

import java.util.*;

public class ZigZagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Deque<TreeNode> dq = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean qTurn = true;
        if(root == null) return ans;
        dq.offer(root);

        while(!dq.isEmpty()){

            ArrayList<Integer> list = new ArrayList<>();
            if(qTurn){
                int n = dq.size();
                for(int i=0;i<n;i++){
                    TreeNode t = dq.pollFirst();
                    list.add(t.val);
                    if(t.left != null)
                        dq.addLast(t.left);

                    if(t.right != null)
                        dq.addLast(t.right);


                }

                qTurn = false;
            }
            else{
                int n = dq.size();
                for(int i=0;i<n;i++){
                    TreeNode t = dq.pollLast();
                    list.add(t.val);
                    if(t.right != null)
                        dq.addFirst(t.right);

                    if(t.left != null)
                        dq.addFirst(t.left);


                }

                qTurn = true;
            }
            ans.add(list);
        }

        return ans;

    }
}