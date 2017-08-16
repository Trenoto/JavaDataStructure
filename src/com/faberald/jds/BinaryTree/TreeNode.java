package com.faberald.bt;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    private int val;

    public TreeNode() {
        this.left = null;
        this.right=null;
        val=0;

    }

    public TreeNode(int val) {
        this.left = null;
        this.right=null;
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

}
