package leetCode.binarysearchtree;

import util.tree.TreeNode;

public class _230_kthsmallestElementinbst {
    int pos=-1;
    int counter=0;
    public int kthSmallest(TreeNode root, int k) {
        find(root,k);
        return pos;
    }

    private void find(TreeNode root, int k){
        if(pos!=-1){
            if(root==null)
                return;
            find(root.left,k);
            counter++;
            if(counter==k) {
                pos = root.val;
                return;
            }
            find(root.right,k);
        }
    }
}
