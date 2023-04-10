import java.util.ArrayList;

/*
 
 Return an one-dimensional array denoting the path from Root to the node B in
 order.
 
 Example Input
 Input 1:
 
 A =
 
    1
   / \
  2   3
 / \ / \
 4 5 6 7

 
 B = 5
 

 Example Output
 Output 1:

  [1, 2, 5]
  
 */

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Solution {
    ArrayList<Integer> res = new ArrayList<>();

    public boolean getPath(TreeNode root, int node) {

        if (root == null)
            return false;
        res.add(root.val);
        if (root.val == node)
            return true;

        if (getPath(root.left, node) || getPath(root.right, node))
            return true;

        res.remove(res.size() - 1);
        return false;
    }

    public ArrayList<Integer> solve(TreeNode A, int B) {

        if (A == null)
            return res;
        getPath(A, B);
        return res;
    }
}