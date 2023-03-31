package ru.sergeysemenov;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode l13 = new ListNode(3);
        ListNode l12 = new ListNode(4,l13);
        ListNode l1 = new ListNode(2,l12);
        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(6,l23);
        ListNode l2 = new ListNode(5,l22);

        ListNode result = addTwoNumbers(l1,l2);
        System.out.print(result.val+" ");
        while (result.next!=null){
            result = result.next;
            System.out.print(result.val+" ");
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
       ListNode dummy = new ListNode(0);
       ListNode current = dummy;
       int val = 0;
       while (l1 != null || l2!=null || val==1){
           int sum = 0;
           if(l1!=null){
               sum+=l1.val;
               l1=l1.next;
           }
           if(l2!=null){
               sum+=l2.val;
               l2=l2.next;
           }
           sum+=val;
           val = sum/10;
           ListNode node = new ListNode(sum%10);
           current.next = node;
           current = current.next;
       }
       return dummy.next;
    }

}
