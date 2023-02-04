package Week2;

import java.util.*;

public class PopulateNextPointer2 {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        HashMap<Integer,Node> map=new HashMap<>();
        findRightmostNode(root,map,0);
        Node ans=helper(root,map);
        return ans;
    }

    public Node helper(Node root,HashMap<Integer,Node> mapOfRight){
        //we will use bfs here
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node curr=queue.remove();
            System.out.println(curr.val);
            if(mapOfRight.containsValue(curr)){
                curr.next=null;
            }
            else{
                curr.next=queue.peek();
            }
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
        return root;
    }

    public void findRightmostNode(Node root,HashMap<Integer,Node> map,int height){
        if(root==null){
            return;
        }
        map.put(height,root);
        findRightmostNode(root.left,map,height+1);
        findRightmostNode(root.right,map,height+1);
    }
}
