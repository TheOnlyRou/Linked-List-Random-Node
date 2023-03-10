public class Solution {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    int length=0;
    ListNode temp;
    ListNode golbhead;
    public Solution(ListNode head) {
        temp=head;
        golbhead=head;
        while (temp!=null)
        {
            length++;
            temp=temp.next;
        }
    }
    public int getRandom() {
        int a =(int)(Math.random()*length);
        temp=golbhead;
        for (int i=0;i<a;i++)
        {
            temp=temp.next;
        }
        return temp.val;
    }


    public static void main(){

    }
}
