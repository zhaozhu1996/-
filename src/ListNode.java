public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }

      public static ListNode createList(int[] nums){
          ListNode dummyHead = new ListNode(-1);
          ListNode p = dummyHead;
          for (int i = 0; i < nums.length; i++) {
              ListNode listNode = new ListNode(nums[i]);
              p.next = listNode;
              p = p.next;
          }

          return dummyHead.next;
      }
}