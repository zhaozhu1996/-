public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null||root.right==null&&root.left==null){
            return root;
        }
        TreeNode node = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = node;
        return root;
    }
}
