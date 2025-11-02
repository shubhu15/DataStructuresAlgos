# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:

        det = set(nums)

        while head and head.val in det:
            head= head.next
        # for n in nums:
        #     if n not in visited:
        curr=head

        while curr and curr.next:
            if curr.next.val in det:
                curr.next= curr.next.next
                
            else:
                curr= curr.next


        return head

        

        