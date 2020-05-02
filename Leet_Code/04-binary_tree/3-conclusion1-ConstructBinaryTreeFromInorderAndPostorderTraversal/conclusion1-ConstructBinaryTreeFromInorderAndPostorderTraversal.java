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
    private TreeNode buildTreeHelper(ArrayList<Integer> io, ArrayList<Integer> po) {
        TreeNode root = new TreeNode();
        
        String str = "inorder: ";
        
        for (int i = 0; i < io.size(); i++) {
            str += io.get(i) + ", ";
        }
        
        str = str.substring(0, str.length()-2) + "\npostorder: ";
        
        for (int j = 0; j < po.size(); j++) {
            str += po.get(j) + ", ";
        }
        
        str = str.substring(0, str.length()-2) + "\n";
        
        System.out.println(str);
        
        return root;
    }    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == postorder.length && inorder.length > 1) {
            TreeNode root = new TreeNode(postorder[postorder.length-1]);
            
            int ioRootLoc = 0;
            
            for (int i = 0; i < inorder.length; i++) {
                if (inorder[i] == root.val)
                    break;
                
                ioRootLoc++;
            }
            
            ArrayList<Integer> ioLeft = new ArrayList<>();
            ArrayList<Integer> ioRight = new ArrayList<>();
            ArrayList<Integer> poLeft = new ArrayList<>();
            ArrayList<Integer> poRight = new ArrayList<>();
            
            for (int i = 0, j = 1; i < inorder.length && j < postorder.length; i++, j++) {
                if (i < ioRootLoc) {
                    ioLeft.add(inorder[i]);
                    poLeft.add(postorder[i]);
                } else {
                    ioRight.add(inorder[j]);
                    poRight.add(postorder[i]);
                }
            }
                        
            root.left = buildTreeHelper(ioLeft, poLeft);
            root.right = buildTreeHelper(ioRight, poRight);
            
            return root;
        } else if (inorder.length == 1 && postorder.length == 1) {
            TreeNode root = new TreeNode(postorder[0]);
            return root;
        } else
            return null;
    }
}