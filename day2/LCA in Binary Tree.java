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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //check if root equals p or q, if yes, return root
        //else
        //call left subtree
        //call right subtree
        //if both left and right return non null, then that node is the answer
        // else if left returns non null, then left, else right
        //
        if(root==null){
            return null;
        }
        if(p==null || q==null){
            return null;
        }
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode a = lowestCommonAncestor(root.left, p, q);
        TreeNode b = lowestCommonAncestor(root.right, p, q);
        if(a!=null && b!=null){
            return root;
        }
        return a==null? b : a;

    }
}