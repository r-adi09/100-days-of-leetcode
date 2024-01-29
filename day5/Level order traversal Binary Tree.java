/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // traverse root
        // add to queue
        // loop through queue
        // pop from queue
        // but how to add all elements from the same level into the
        // same array list?
        // add its children to queue

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> level;
        q.add(root);

        while (!q.isEmpty()) {
            level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode x = q.poll();
                if (x != null) {
                    level.add(x.val);
                    q.add(x.left);
                    q.add(x.right);
                }
            }

            if (!level.isEmpty())
                res.add(level);
        }
        return res;
    }
}