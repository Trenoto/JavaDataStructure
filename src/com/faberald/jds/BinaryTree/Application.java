package com.faberald.bt;

public class Application {
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
//        bt.insert(5);
        bt.inorder();

    }
}
