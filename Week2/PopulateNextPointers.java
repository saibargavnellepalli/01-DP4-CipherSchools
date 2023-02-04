package Week2;

import java.util.*;
import java.util.Queue;

class Node{
    public Node next;
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
      
    }
}
public class PopulateNextPointers {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();

        if(root == null)
            return null;
        q.add(root);

        while(!q.isEmpty()){

            int x = 0;
            List<Node> Innerlist = new ArrayList<>();

            int n = q.size();
            while(x<n){

                Node temp = q.peek();
                Innerlist.add(temp);
                q.remove();

                if(temp.left!=null)
                    q.add(temp.left);

                if(temp.right!=null)
                    q.add(temp.right);

                x++;

            }


            for(int i=0;i<Innerlist.size()-1;i++){

                Innerlist.get(i).next = Innerlist.get(i+1);
            }
        }
        return root;
    }
}
