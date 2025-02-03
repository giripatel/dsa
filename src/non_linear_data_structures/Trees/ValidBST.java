package non_linear_data_structures.Trees;

public class ValidBST {
    TNode root;
    private boolean isValidTree(TNode root, int min, int max){
        if (root == null) return true;

        if (root.data <= min || root.data >= max) return false;
        return isValidTree(root.leftChild,min,max) && isValidTree(root.rightChild, min, max);
    }

    public boolean isValidTBST(){
        return isValidTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
