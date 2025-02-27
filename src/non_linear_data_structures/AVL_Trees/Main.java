package non_linear_data_structures.AVL_Trees;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        int a[] = {10,5,7};

        for (int i : a){
            tree.insert(i);
        }

        System.out.println(tree);
    }
}
