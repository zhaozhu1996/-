public class ReverseLinkedListII92 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||m>=n) return head;
        ListNode pre = null;
        ListNode mid = head;
        ListNode l = null,r = null;
        ListNode le = null,ri = null;
        int i = 1;
        while (mid!=null){
            if(i>=n+2) break;
            if(i==m-1) l = mid;
            if(i==n+1) r = mid;
            if(i==m) le = mid;
            if(i==n) ri = mid;
            ListNode next = mid.next;
            if(i<=n&&i>m) mid.next = pre;
            pre = mid;
            mid = next;
            i++;
        }
        if(l!=null) l.next = ri;
        le.next = r;
        if((l!=null&&r!=null)||(l!=null&&r==null)) return head;
        if((l==null&&r!=null)||(l==null&&r==null)) return ri;
        return r==null?pre:head;
    }
    public static void main(String[] args) {
        ListNode partition = reverseBetween(ListNode.createList(new int[]{1,2,3,4,5}),1,5);
        System.out.println(partition);
    }
}
