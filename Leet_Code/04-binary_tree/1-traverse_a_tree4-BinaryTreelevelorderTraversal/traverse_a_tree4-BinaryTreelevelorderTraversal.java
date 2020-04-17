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
        
        if (root == null)
            return loList;

        List<Integer> currentLevel = new ArrayList();
        LinkedList<TreeNode> list4Nodes1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> list4Nodes2 = new LinkedList<TreeNode>();
        
        currentLevel.add(root.val);
        loList.add(currentLevel);
        currentLevel = new ArrayList();

        if (root.left != null)
            list4Nodes1.addLast(root.left);
        if (root.right != null)
            list4Nodes1.addLast(root.right);
        
        while (list4Nodes1.peek() != null || list4Nodes2.peek() != null) {
            if (list4Nodes1.peek() == null) {
                loList.add(currentLevel);
                currentLevel.clear();
                list4Nodes1 = list4Nodes2;
                list4Nodes2.clear();
            } else {
                if (list4Nodes1.peek().left != null)
                    list4Nodes2.addLast(list4Nodes1.peek().left);
                if (list4Nodes1.peek().right != null)
                    list4Nodes2.addLast(list4Nodes1.peek().right);
                
                currentLevel.add(list4Nodes1.removeFirst().val);
            }
        }
        
        return loList;
    }
}