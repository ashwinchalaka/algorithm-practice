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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> poList = new ArrayList<Integer>();
        
        if (root == null)
            return poList;
        
        Stack<TreeNode> stack4Nodes = new Stack<TreeNode>();
        
        // poList.add(root.val);
        System.out.println(root.val);
        poList.add(root.val);
        
        TreeNode walker = root.left;
        
        while (walker != null) {
            System.out.println(walker.val);
            poList.add(walker.val);
            if (walker.right != null) {
                stack4Nodes.add(walker.right);
            }
            walker = walker.left;
        }
        
        while (!stack4Nodes.empty()) {
            walker = stack4Nodes.pop();
            System.out.println(walker.val);
            poList.add(walker.val);
            if (walker.right != null) {
                stack4Nodes.add(walker.right);
            }
            if (walker.left != null) {
                stack4Nodes.add(walker.left);
            }
        }
        
        walker = root.right;
        
        while (walker != null) {
            System.out.println(walker.val);
            poList.add(walker.val);
            if (walker.left != null) {
                stack4Nodes.add(walker.left);
            }
            walker = walker.right;
        }
        
        while (!stack4Nodes.empty()) {
            walker = stack4Nodes.pop();
            System.out.println(walker.val);
            poList.add(walker.val);
            if (walker.right != null) {
                stack4Nodes.add(walker.right);
            }
            if (walker.left != null) {
                stack4Nodes.add(walker.left);
            }
        }
        
        return poList;
    }
}