package com.faberald.bt;

public class BinaryTree {
    private TreeNode root;

    public  BinaryTree(){
        root = null;
    }

    private TreeNode insert(TreeNode node, int val){
        if (node == null)
            node = new TreeNode(val);
        else{
            if (node.getRight() == null)
                node.right = insert(node.right,val);
            else
                node.left = insert(node.left,val);
        }

        return node;
    }

    public void insert(int val){
        root = insert(root,val);
    }
    private boolean search(TreeNode node, int val){
        if (node.getVal() == val)
            return true;
        else{
            if(node.getLeft() !=null)
                if(search(node.left,val))
                    return true;
            if(node.getRight() != null)
                if(search(node.right,val))
                    return true;
        }
        return false;
    }

    public boolean search(int val){
        return search(root,val);
    }

    private void inorder(TreeNode node){
        if(node != null){
            inorder((node.getLeft()));
            System.out.println(node.getVal() + " ");
            inorder(node.getRight());
        }
    }

    public void inorder(){
        inorder(root);
    }



}
