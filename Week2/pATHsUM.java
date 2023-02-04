package Week2;

import java.util.*;

public class pATHsUM {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> pathList = new ArrayList<>();
        findPaths(root,targetSum,ansList,pathList,0);
        return ansList;
    }

    public void findPaths(TreeNode root, int k,  List<List<Integer>> ansList, List<Integer> pathList,int currentSum){
        if(root == null)
            return;

        // adding current root to the path list
        pathList.add(root.val);
        System.out.println(pathList);
        // updating current sum
        currentSum += root.val;

        //add list to ans
        if(root.left == null && root.right == null && currentSum == k){
            List<Integer> arr = pathList;
            ansList.add(arr);
        }

        // calls to the sub trees
        findPaths(root.left, k, ansList, pathList, currentSum);
        findPaths(root.right, k, ansList, pathList, currentSum);

        pathList.remove(pathList.size()-1);
    }
}
