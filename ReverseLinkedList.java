/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


*/
#code-
  class Solution{
    public ListNode reverseList(ListNode head){
      ListNode current=head;
      ListNode previous=null;
      ListNode next=null;
      while(current!=null){
        next=current.next;
        current.next=previous;
        previous=current;
        current=next;
      }
      return previous;
    }
  }
