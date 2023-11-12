/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


//Note
//This code does'nt pass all test cases


class Solution {
    int count=0;
    ArrayList<Integer> arr=new ArrayList<>();
    // ArrayList<Integer> brr=new ArrayList<>();
    public ArrayList<Integer> preorder(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            // int bb=Integer.MIN_VALUE;
            // a.add(-1);
            return a;
        }
       
        preorder(root.left,a);
         a.add(root.val);
        preorder(root.right,a);
        return a;

    }
    public boolean isSymmetric(TreeNode root) {
         ArrayList<Integer> ar=preorder(root,arr);
         int i=0,j=ar.size()-1;
         System.out.println(ar);
         while(i!=j){
             if(ar.get(i)!=ar.get(j)){
                 return false;
             }
             i++;
             j--;
            
         } return true;
    }
}
