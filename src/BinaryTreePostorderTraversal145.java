import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> integers = new LinkedList<>();
        if(root==null){
            return integers;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode pop = stack.pop();
            if(pop.left!=null){
                stack.push(pop.left);
            }
            if(pop.right!=null){
                stack.push(pop.right);
            }
            integers.add(0,pop.val);
        }

        return integers;
    }
}
