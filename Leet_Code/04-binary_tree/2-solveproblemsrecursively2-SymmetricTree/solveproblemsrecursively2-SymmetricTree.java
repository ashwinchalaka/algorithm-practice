/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
//      Etch Cases: (1) empty list
//                  (2) root and no children
//                  (3) children with different values
        if (root == null)
            return true;
        else if (root.left == null && root.right == null)
            return true;
        else if (root.left.val != root.right.val)
            return false;
        
//      If we're still not sure we need to compare one level at a time
        Queue<TreeNode> currentLevel = new LinkedList<>();
        currentLevel.add(root.left);
        currentLevel.add(root.right);
        
        while (!currentLevel.isEmpty()) {
            
            int clSize = currentLevel.size();
            
            for (int i = 0; i < clSize; i=i+2) {
//              poll() is a method like pop() but for LinkedList(), it removes ... 
//              ... and returns the head of the list.
                TreeNode left = currentLevel.poll();
                TreeNode right = currentLevel.poll();

                if (left.val != right.val)
                    return false;
                
                
            }
            
//          these are the children belonging to the next level
//          pair #1: 
            currentLevel.add(left.left);
            currentLevel.add(right.right);

            currentLevel.add(left.right);
            currentLevel.add(right.left);
        }
        
        return true;
    }
}