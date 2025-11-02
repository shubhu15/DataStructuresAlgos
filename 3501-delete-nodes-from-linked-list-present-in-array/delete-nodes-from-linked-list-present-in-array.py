# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:

        det = set(nums)

        # while head and head.val in det:
        #     head= head.next
        # # for n in nums:
        # #     if n not in visited:
        # curr=head

        def deleteNode():
            dummy = ListNode()
            dummy.next = head
            curr= dummy.next
            prev = dummy

            while curr:
                if curr.val in det:
                    prev.next= curr.next
                    curr= curr.next
                    
                else:
                    prev=curr
                    curr= curr.next

            return dummy.next

        

        return deleteNode()

        

        