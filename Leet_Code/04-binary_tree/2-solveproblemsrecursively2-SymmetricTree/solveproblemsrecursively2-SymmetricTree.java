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
        if (root == null)
            return true;
        else if (root.left == null && root.right == null)
            return true;
        else if (root.left.val != root.right.val)
            return false;
        
        Queue<TreeNode> currentLevel = new LinkedList<>();
        
        currentLevel.add(root.left);
        currentLevel.add(root.right);
        
        while (!currentLevel.isEmpty()) {
            
            
            
            
        }
        
        return true;
    }
}