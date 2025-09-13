package leetCode.binarysearchtree;

import org.junit.jupiter.api.Test;
import util.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _98_ValidateBST {

    List<Integer> inorderList=new ArrayList<>();
    Boolean isBST=true;
    public boolean isValidBST(TreeNode root) {
        insertNodesToList(root);
        int size = inorderList.size();
        if (size == 1) {
            return true;
        } else{
          for(int i=1;i<size;i++){
              if(inorderList.get(i-1)>inorderList.get(i)){
                  isBST=false;
                  break;
              }
          }
        }
        return isBST;
    }

    private void insertNodesToList(TreeNode root){
        if(root==null)
            return;
        insertNodesToList(root.left);
        inorderList.add(root.val);
        insertNodesToList(root.right);
    }

    @Test
    public void tc1(){
        TreeNode t = new TreeNode(5,
                    new TreeNode(1),
                    new TreeNode(4,
                            new TreeNode(3),
                            new TreeNode(6)
                    )
                );
        System.out.println(isValidBST(t));
    }
}
