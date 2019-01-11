public class PathSumIII437 {
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        return findPath(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }

    private int findPath(TreeNode root, int sum){
        if(root==null){
            return 0;
        }
        int res = 0;
        if(root.val==sum){
            res+=1;
        }
        res+=findPath(root.right,sum-root.val);
        res+=findPath(root.left,sum-root.val);
        return res;
    }
}
