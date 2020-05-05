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
              
        String str = "\ninorder: ";
        
        for (int i = 0; i < io.size(); i++) {
            str += io.get(i) + ", ";
        }
        
        str = str.substring(0, str.length()-2) + "\npostorder: ";
        
        for (int j = 0; j < po.size(); j++) {
            str += po.get(j) + ", ";
        }
        
        str = str.substring(0, str.length()-2);
        
        System.out.println(str);
        
        ///////////////////////////////////////////////////////////////////
        
        TreeNode root = new TreeNode();
        
        if (io.size() == 1) {
            root.val = io.remove(0);
            po.remove(0);
        } else if (io.size() == 2) {
            // 1st instance: 2 values correspond to left and root
            
            
            root.val = io.remove(1);
            po.remove(1);
            root.left = new TreeNode(io.remove(0));
            po.remove(0);
            
            // 2nd instance: 2 values correspond to root and right
            
            root.val = io.remove(0);
            po.remove(0);
            root.right = new TreeNode(io.remove(0));
            po.remove(0);
        } else if (io.size() == 3) {
            
        } else {
            
        }
        
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
            
            System.out.println("inorder root: " + inorder[ioRootLoc]);
            System.out.println("postorder root: " + postorder[postorder.length-1]);
            
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