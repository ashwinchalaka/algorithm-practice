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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> poList = new ArrayList<Integer>();
        
        if (root == null)
            return poList;
        
        TreeNode walker = root;
        Stack<TreeNode> stack4Nodes = new Stack<TreeNode>();

        stack4Nodes.push(walker);
        stack4Nodes.push(walker);
        
        if (walker.right != null)
            stack4Nodes.push(walker.right);

        if (walker.left != null)
            stack4Nodes.push(walker.left);
        
        while (!stack4Nodes.empty()) {
            walker = stack4Nodes.pop();
            System.out.println(walker.val);
            
            if (!stack4Nodes.empty() && walker == stack4Nodes.peek()) {
                walker = stack4Nodes.pop();
                poList.add(walker.val);
            } else if (walker.left == null && walker.right == null) {
                poList.add(walker.val);
            } else {
                stack4Nodes.push(walker);
                stack4Nodes.push(walker);

                if (walker.right != null)
                    stack4Nodes.push(walker.right);

                if (walker.left != null)
                    stack4Nodes.push(walker.left);
            }
        }
        
        return poList;
    }
}