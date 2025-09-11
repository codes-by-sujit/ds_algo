package leetCode.binarytree;

import util.tree.TreeNode;

import java.util.Stack;

public class _173_Binary_SearchTreeIterator {
    class BSTIterator {

        Stack<TreeNode> nodes=new Stack<>();

        public BSTIterator(TreeNode root) {
            leftPush(root);
        }

        public int next() {
            TreeNode n=nodes.pop();
            leftPush(n.right);
            return n.val;
        }

        public boolean hasNext() {
            return !nodes.isEmpty();
        }

        private void leftPush(TreeNode root){
            TreeNode temp=root;
            while(temp!=null){
                nodes.push(temp);
                temp=temp.left;
            }
        }
    }

}
