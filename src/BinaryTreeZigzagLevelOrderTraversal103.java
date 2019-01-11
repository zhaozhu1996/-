import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            int size = queue.size();
            while (size>0){
                TreeNode poll = queue.poll();
                if(depth%2==0){
                    temp.add(poll.val);
                }else {
                    temp.add(0,poll.val);
                }
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
