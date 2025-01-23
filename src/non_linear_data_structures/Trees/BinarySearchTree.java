package non_linear_data_structures;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
    }
}

public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value){
        TreeNode node = new TreeNode(value);

        if (root == null){
            root = node;
            return;
        }

        TreeNode current = node;
        while ()
    }

}
