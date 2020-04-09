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
        Stack<TreeNode> stack4Nodes = new Stack<TreeNode>();
        
        // poList.add(root.val);
        System.out.println(root.val);
        
        TreeNode walker = root.left;
        
        while (walker.left != null) {
            System.out.println(walker.val);
            if (walker.right != null)
                stack4Nodes.add(walker);
            walker = walker.left;
        }
        
        while (!stack4Nodes.empty()) {
            walker = stack4Nodes.pop();
            while (walker.left != null) {
                walker = walker.left;
                System.out.println(walker.val);
            }
            while (walker.right != null) {
                walker = walker.right;
                System.out.println(walker.val);
            }
        }
        
        walker = root.right;
        
        while (walker.right != null) {
            System.out.println(walker.val);
            if (walker.left != null)
                stack4Nodes.add(walker);
            walker = walker.right;
        }
        
        while (!stack4Nodes.empty()) {
            walker = stack4Nodes.pop();
            while (walker.left != null) {
                walker = walker.left;
                System.out.println(walker.val);
            }
            while (walker.right != null) {
                walker = walker.right;
                System.out.println(walker.val);
            }
        }
        
        return poList;
    }
}