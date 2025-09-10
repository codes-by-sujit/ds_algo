package leetCode.binarytree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class _106_BTFromInorderPostOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }

        return build(postorder,0,postorder.length-1,
                inorder,0,inorder.length-1,inMap);
    }

    private TreeNode build(int[] postOrder, int postOrderStart, int postOrderEnd,
                           int[] inOrder, int inorderStart, int inorderEnd,
                           Map<Integer,Integer> inMap){
        if(postOrderStart>postOrderEnd || inorderStart>inorderEnd)
            return null;
        TreeNode root = new TreeNode(postOrder[postOrderEnd]);
        int rootIndex=inMap.get(root.val);
        int numLeft=rootIndex-inorderStart;
        root.left=build(postOrder,postOrderStart, postOrderStart+numLeft-1,
                inOrder, inorderStart,rootIndex-1,inMap);
        root.right=build(postOrder,postOrderStart+numLeft,postOrderEnd-1,
                inOrder,rootIndex+1, inorderEnd,inMap);
        return root;
    }

    @Test
    public void tc1(){
        int[] inorder=new int[]{9,3,15,20,7};
        int[] postorder=new int[]{9,15,7,20,3};
        System.out.println(this.buildTree(inorder,postorder));
    }
}
