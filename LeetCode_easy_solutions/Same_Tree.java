class Solution {
    ArrayList<Integer> arr=new ArrayList<>();
    ArrayList<Integer> brr=new ArrayList<>();
    public ArrayList<Integer> preorder(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            int bb=Integer.MIN_VALUE;
            a.add(-1);
            return a;
        }
        a.add(root.val);
        preorder(root.left,a);
        preorder(root.right,a);
        return a;

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> arr1=preorder(p,arr);
        ArrayList<Integer> arr2=preorder(q,brr);
        return arr1.equals(arr2);
    }
}
