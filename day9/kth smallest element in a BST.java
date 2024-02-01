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
    List<Integer> ar = new ArrayList<>();

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);


    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }

        inorder(root);
        return ar.get(k-1);

    }

}