/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]
Output: [1,3,2]

*/

#code--------------
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<Integer>();
        print(root,list);
        return list;
    }
    private void print(TreeNode Node,List<Integer>list){
            if(Node==null)
                return;
            print(Node.left,list);
            list.add(Node.val);
            print(Node.right,list);
        }
    
}
