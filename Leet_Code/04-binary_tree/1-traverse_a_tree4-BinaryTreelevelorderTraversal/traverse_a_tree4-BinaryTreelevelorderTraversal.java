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
        
        if (root.val == null)
            return loList;

        List<Integer> currentLevel = new ArrayList();
        Queue<Integer> queue4Nodes1 = new Queue<Integer>();
        Queue<Integer> queue4Nodes2 = new Queue<Integer>();
        
        currentLevel.add(root.val);
        loList.add(currentLevel);
        currentLevel = new ArrayList();

        if (root.left != null)
            queue4Nodes1.push(root.left);
        if (root.right != null)
            queue4Nodes1.push(root.right);
        
        while (!queue4Nodes1.empty() || !queue4Nodes2.empty()) {
            
            if (queue4Nodes1.empty()) {
                loList.add(currentLevel);
                currentLevel = newArrayList;
                queue4Nodes1 = queue4Nodes2;
                queue4Nodes2 = new Queue<Integer>();
            }
            
            currentLevel.add(queue4Nodes1.remove().val);
            
            if (root.left != null)
                queue4Nodes2.push(root.left);
            if (root.right != null)
                queue4Nodes2.push(root.right);
        }
        
        return loList;
    }
}