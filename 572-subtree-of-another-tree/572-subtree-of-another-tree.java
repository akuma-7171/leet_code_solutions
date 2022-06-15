class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root == null){
            return false;
        }
        
        if(issubtreeFound(root, subRoot)){
            return true;
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
    }
    
    public boolean issubtreeFound(TreeNode s, TreeNode t){
        
        if(s == null || t == null){
            return s == t;
        }
        
        if(s.val != t.val){
            return false;
        }

        return issubtreeFound(s.left, t.left) && issubtreeFound(s.right, t.right);
    }
}