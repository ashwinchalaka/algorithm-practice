/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == postorder.length && inorder.length > 1) {
            TreeNode root = new TreeNode(postorder[postorder.length-1]);
            
            int ioRootLoc = 0;
            // int leftTreeLength = 0;
            // int rightTreeLength = 0;
            
            for (int i = 0; i < inorder.length; i++) {
                if (inorder[i] == root.val)
                    break;
                
                ioRootLoc++;
                // leftTreeLength++;
            }
            
            // rightTreeLength = inorder.length - ioRootLoc - 1;

            // System.out.println(ioRootLoc + " " + inorder[ioRootLoc]);
            // System.out.println("left: " + leftTreeLength + " right: " + rightTreeLength);
            
            
            
            return root;
        } else if (inorder.length == 1 && postorder.length == 1) {
            TreeNode root = new TreeNode(postorder[0]);
            return root;
        } else
            return null;
    }
}