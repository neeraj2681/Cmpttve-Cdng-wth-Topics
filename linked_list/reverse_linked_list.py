# https://leetcode.com/problems/reverse-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        #iterative solution
        if not head or not head.next:
            return head
        
        prev, nexter = head, head.next
        prev.next = None

        while nexter:
            temp = nexter.next
            nexter.next = prev
            prev = nexter
            nexter = temp
        return prev  


        #recursive solution
        def recursive_reversal(cur, prev):
            if not cur:
                return prev
            temp = cur.next
            cur.next = prev
            cur, prev = temp, cur

            return recursive_reversal(cur, prev)
        
        return recursive_reversal(head, None)
        