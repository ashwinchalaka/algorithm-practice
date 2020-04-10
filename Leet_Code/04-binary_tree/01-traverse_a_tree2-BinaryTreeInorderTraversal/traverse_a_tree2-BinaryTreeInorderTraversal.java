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
        
        if (root.left != null) {
            TreeNode walker = root.left;
            
            Stack<TreeNode> stack4NodesLeft = new Stack<TreeNode>();
            
            while (walker != null) {
                stack4NodesLeft.push(walker);
                walker = walker.left;
            }
            
            while (!stack4NodesLeft.empty()) {
                walker = stack4NodesLeft.pop();
                if (walker.left == null)
                    System.out.println(walker.val);
                if (walker.right != null)
                    stack4NodesLeft.push(walker.right);
                if (walker.left != null)
                    stack4NodesLeft.push(walker.left);
            }
        }
        
//         ioList.add(root.val);
//         System.out.println(root.val);
        
//         if (root.right != null) {
//             TreeNode walker = root.right;
//         }
        
        return ioList;
    }
}