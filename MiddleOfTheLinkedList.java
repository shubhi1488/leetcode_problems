/*
876. Middle of the Linked List
Easy

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

*/

#code-
  class Solution{
    public ListNode MiddleNode(ListNode head){
      ListNode slowPtr=head;
      ListNode fastPtr=head;
      while(fastPtr!=null && fastPtr.next!=null){
        slowPtr=slowPtr.next;
        fastPtr=fastPtr.next.next;
      }
      return slowPtr;
    }
  }
