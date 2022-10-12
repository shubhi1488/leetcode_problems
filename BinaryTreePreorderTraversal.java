/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]
Output: [1,2,3]

*/


#code-----------------------------
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<Integer>();//created the new list to store the values.
        dfs(root,list);//call  the method to perform preorder traversal
        return list;//returb the list containing all 
    }
    private void dfs(TreeNode node,List<Integer>list){
        if(node==null) return;
        list.add(node.val);//
        dfs(node.left,list);
        dfs(node.right,list);
    }
}

Iterative approach-
 class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer>list=new ArrayList<Integer>();
        Stack<TreeNode>rights=new Stack<TreeNode>();
        while(root!=null){
            list.add(root.val);
            if(root.right!=null){
                rights.push(root.right);
            }
            if(root.left==null && !rights.isEmpty()){
                root=rights.pop();
            }
            else{
                root=root.left;
            }
        }
        return list;
}
}
