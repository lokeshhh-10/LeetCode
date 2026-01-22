# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        return self.dfscomparison(p,q)

    

    def dfscomparison(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not p and not q:
            return True
        if p and q:
            x,y=self.dfscomparison(p.left, q.left), self.dfscomparison(p.right, q.right)
            if x and y and p.val==q.val:
                return True
        return False
        