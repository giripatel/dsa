package non_linear_data_structures.AVL_Trees;

import linear_data_structures.Arrays.SortColors;

class AVLNode{
    int value;
    AVLNode leftChild;
    AVLNode rightChild;
    int height;

    public AVLNode(int value){
        this.value = value;
        this.height = 0;
    }

    public String toString(){
        return "value=" + value;
    }
}
public class AVLTree {

    AVLNode root;
    private AVLNode insert(AVLNode root, int value){
        if (root == null) return new AVLNode(value);

        if (root.value == value) return root;

        if (root.value > value){
            root.leftChild = insert(root.leftChild, value);
        } else {
            root.rightChild = insert(root.rightChild, value);
        }

        root.height = Math.max(getHeight(root.leftChild), getHeight(root.rightChild)) + 1;
        if (!isBalanced(root)) {
            if (isLeftHeavy(root)){
                if (getBalanceFac(root.leftChild) < 0){
                   root.leftChild = leftShift(root.leftChild);
                }
                root = rightShift(root);
            } else if (isRightHeavy(root)) {
                if (getBalanceFac(root.rightChild) > 0){
                   root.rightChild = rightShift(root.rightChild);
                }
                root = leftShift(root);
            }
        }
        return root;
    }
    public void insert(int value){
       root = insert(root, value);
    }

    public int getBalanceFac(AVLNode node) {
        if (node == null) return 0;
        return getHeight(node.leftChild) - getHeight(node.rightChild);
    }

    public boolean isBalanced(AVLNode node){
        if (node == null) return  true;

        int myBalance = getBalanceFac(node);
        return myBalance >= -1 && myBalance <= 1;
    }

    public int getHeight(AVLNode node){
        if (node == null) return -1;
        return node.height;
    }

    private boolean isLeftHeavy(AVLNode node){
        if (node == null) return false;

        int balanceFactor = getBalanceFac(node);

        return balanceFactor > 1;
    }

    private boolean isRightHeavy(AVLNode node){
        if (node == null) return false;

        int balanceFactor = getBalanceFac(node);
        return balanceFactor < -1;
    }

    private AVLNode leftShift(AVLNode root){
        if (root == null) return null;

        AVLNode newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;
        return newRoot;
    }

    private AVLNode rightShift(AVLNode root){
        if (root == null) return null;

        AVLNode newRoot = root.leftChild;
        root.leftChild  = newRoot.rightChild;
        newRoot.rightChild = root;
        return newRoot;
    }
}
