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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> loList = new ArrayList();
        List<Integer> currentLevel = new ArrayList();
        Queue queue4Nodes = new Queue();
        
        if (root.val == null)
            return loList;
        else {
            currentLevel.add(root.val);
            if (root.left != null)
                queue4Nodes.push(root.left);
            if (root.right != null)
                queue4Nodes.push(root.right);
        }
        
        loList.add(currentLevel);
        currentLevel = new ArrayList();
        
        while (!queue4Nodes.empty()) {
            
            if (root.left != null)
                queue4Nodes.push(root.left);
            if (root.right != null)
                queue4Nodes.push(root.right);
        }
        
        return loList;
    }
}