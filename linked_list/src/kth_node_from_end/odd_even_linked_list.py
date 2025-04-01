#https://leetcode.com/problems/odd-even-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

### TIP: BEWARE of independently changing the links!!!
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        h1, h2 = head, head.next
        t1, t2 = h1, h2
        prev = h1

        # print(f"{0}: {t1.val}. {t2.val}")
        while t1 and t2 and t2.next:
            t1.next, t2.next = t2.next, t2.next.next
            prev = t1
            t1, t2 = t1.next, t2.next
            # print(f"{0}: {t1.val}")
        if t1:
            prev = t1

        prev.next = h2
        return h1
            
            
        