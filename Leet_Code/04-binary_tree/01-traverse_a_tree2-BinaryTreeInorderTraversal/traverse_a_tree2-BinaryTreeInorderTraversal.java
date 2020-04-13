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

        if (walker.right != null)
            stack4Nodes.push(walker.right);

        stack4Nodes.push(walker);

        if (walker.left != null)
            stack4Nodes.push(walker.left);
        
        // walker = stack4Nodes.pop();
        
        while (!stack4Nodes.empty()) {
            walker = stack4Nodes.pop();
            
            if (walker.left == null && walker.right == null) {
                ioList.add(walker.val);
            } else if (walker.left != null && walker.right == null) {
                if (walker.left.left == null && walker.left.right == null) {
                    ioList.add(walker.left.val);
                    ioList.add(walker.val);
                } else {
                    stack4Nodes.push(walker);
                    stack4Nodes.push(walker.left);
                }
            } else if (walker.left == null && walker.right != null) {
                ioList.add(walker.val);
                if (walker.right.left == null && walker.right.right == null) {
                    ioList.add(walker.right.val);
                } else {
                    stack4Nodes.push(walker.right);
                }
            } else {
                
            }
        }
        
        return ioList;
    }
}