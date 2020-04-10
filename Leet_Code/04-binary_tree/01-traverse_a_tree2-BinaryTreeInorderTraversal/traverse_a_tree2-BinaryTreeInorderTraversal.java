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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ioList = new ArrayList<Integer>();
        
        if (root == null)
            return ioList;
        
        TreeNode walker = root;
        Stack<TreeNode> stack4Nodes = new Stack<TreeNode>();

        while (walker.left != null) {
            if (walker.right != null)
                stack4Nodes.push(walker.right);
            stack4Nodes.push(walker);
            walker = walker.left;
        }

        ioList.add(walker.val);
        
        if (walker.right != null)
            stack4Nodes.push(walker.right);
        
        while (!stack4Nodes.empty()) {
            ioList.add(stack4Nodes.pop().val);
        }
        
        return ioList;
    }
}