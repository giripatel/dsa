package non_linear_data_structures.Trees;

class TreeNode{
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public String toString(){
        return "value="+data;
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

        TreeNode current = root;
        while (true){
            if (value <= current.data){
                if (current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

}
