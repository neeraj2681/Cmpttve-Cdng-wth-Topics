# https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        p1, p2 = head, head.next

        #find the mid point
        while p2.next:
            p2 = p2.next.next
            p1 = p1.next
        

        #reverse second half
        cur = p1.next
        prev = None
        p1.next = None

        while cur:
            temp = cur.next
            cur.next = prev
            cur, prev = temp, cur
            # print(prev.val, cur.val)


        p1 = head
        p2 = prev
        #finding max twin sum
        temp = 0
        jar = p2

        while p2:
            # print(p1.val, p2.val)
            if (p2.val + p1.val) > temp:
                temp = p2.val + p1.val
            p2 = p2.next
            p1 = p1.next
        return temp
        



        