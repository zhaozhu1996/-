import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            int size = queue.size();
            while (size>0){
                TreeNode poll = queue.poll();
                temp.add(poll.val);
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
                size--;
            }
            res.add(temp);
        }

        return res;
    }
}
