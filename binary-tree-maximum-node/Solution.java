public class Solution {
    //dfs recursive
    /**
     * @param root the root of binary tree
     * @return the max ndoe
     */
    private TreeNode res = new TreeNode(Integer.MIN_VALUE);
    public TreeNode maxNode(TreeNode root) {
        // Write your code here
        if (root == null) {
            return root;
        }
        if (root.val > res.val) {
            res = root;
        }
        maxNode(root.left);
        maxNode(root.right);
        return res;
    }

    //dfs iterative
    /**
     * @param root the root of binary tree
     * @return the max ndoe
     */
    public TreeNode maxNode(TreeNode root) {
        // Write your code here
        if (root == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode res = root;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val > res.val) {
                res = node;
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return res;
    }

    //bfs
    /**
     * @param root the root of binary tree
     * @return the max ndoe
     */
    public TreeNode maxNode(TreeNode root) {
        // Write your code here
        if (root == null) {
            return root;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        TreeNode res = root;
        queue.push(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode node = queue.pop();
            if (node.val > res.val) {
                res = node;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            
        }
        return res;
    }
}