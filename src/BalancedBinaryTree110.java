public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        if((root==null)||(root.right==null&&root.left==null)){
            return true;
        }
        if(Math.abs(getH(root.left)-getH(root.right))>1){
            return false;
        }else {
            return isBalanced(root.left)&&isBalanced(root.right);
        }


    }

    private int getH(TreeNode node){
        if(node==null)
            return 0;
        if(node.right==null&&node.left==null){
            return 1;
        }else {
            return Math.max(getH(node.left),getH(node.right)+1);
        }
    }
}
