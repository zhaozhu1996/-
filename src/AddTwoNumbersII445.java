import java.util.Stack;

public class AddTwoNumbersII445 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        int i = 0, j = 0 ,k = 0;
        ListNode list1 = l1,list2 = l2;
        while (list1!=null){
            i++;
            list1 = list1.next;
        }
        while (list2!=null){
            j++;
            list2 = list2.next;
        }
        list1 = l1;
        list2 = l2;
        if(i<j) {
            list1 = l2;
            list2 = l1;
            ListNode l = l2;
            l2 = l1;
            l1 = l;
            int temp = i;
            i = j;
            j = temp;
        }
        while (list1!=null){
            if(k>=(i-j)){
                list1.val = list1.val+list2.val;
                list2 = list2.next;
            }
            k++;
            list1 = list1.next;
        }

        Stack<ListNode> stack = new Stack<>();
        list1 = l1;
        while (list1!=null){
            stack.push(list1);
            list1 = list1.next;
        }
        ListNode temp = new ListNode(-1);
        while (!stack.empty()){
            if(temp.val<=9) temp = stack.pop();
            if(temp.val>=10){
                if(stack.empty()){
                    ListNode listNode = new ListNode(1);
                    listNode.next = temp;
                    temp.val-=10;
                    return listNode;
                }else {
                    ListNode pop = stack.pop();
                    pop.val+=1;
                    temp.val-=10;
                    temp = pop;
                }
            }
        }
        if(l1.val>=10){
            ListNode head = new ListNode(1);
            head.next = l1;
            l1.val-=10;
            return head;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode partition = addTwoNumbers(ListNode.createList(new int[]{
                5}),ListNode.createList(new int[]{5}));
        System.out.println(partition);
    }
}
