# https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return None
        
        h1, h2 = head, head.next

        while h2.next and h2.next.next:
            h1 = h1.next
            h2 = h2.next.next
        
        h1.next = h1.next.next
    
        return head
        