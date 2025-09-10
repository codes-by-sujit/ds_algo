package leetCode.binarytree;

import util.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class _105_BTFromInorderPreOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }

        return build(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1,inMap);
    }

    private TreeNode build(int[] preOrder, int preOrderStart, int preOrderEnd,
                           int[] inOrder, int inorderStart, int inorderEnd,
                           Map<Integer,Integer> inMap){
        if(preOrderStart>preOrderEnd || inorderStart>inorderEnd)
            return null;
        TreeNode root = new TreeNode(preOrder[preOrderStart]);
        int rootIndex=inMap.get(root.val);
        int numLeft=rootIndex-inorderStart;
        root.left=build(preOrder,preOrderStart+1, preOrderStart+numLeft,
                inOrder, inorderStart,rootIndex-1,inMap);
        root.right=build(preOrder,preOrderStart+numLeft+1,preOrderEnd,
                inOrder,rootIndex+1, inorderEnd,inMap);
        return root;
    }
}
