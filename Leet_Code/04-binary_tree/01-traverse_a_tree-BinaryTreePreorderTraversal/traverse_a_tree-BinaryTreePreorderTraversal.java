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
        poList.add(root.val);
        TreeNode walker = root;
        
        while (walker.left != null) {
            walker = walker.left;
            System.out.println(walker.val);
            // poList.add(walker.val);
            // stack4Nodes.push(walker);
        }
        
        while (!stack4Nodes.empty()) {
            walker = stack4Nodes.pop();
            System.out.println(walker.val);
            // poList.add(walker.val)
        }
        
        return poList;
    }
}