package non_linear_data_structures.Trees;

import java.util.ArrayList;

public class Mian {
    public static void main(String[] args) {
        TraverseRecur tree = new TraverseRecur();
        TraverseRecur t2  = new TraverseRecur();
//        tree.add(2);
//        tree.add(1);
//        System.out.println("Hello");

      //  BinarySearchTree tree = new BinarySearchTree();

        int[] arr = {7,3,8,1,2,4,10};
//        int[] arr2 = {7,3,8,1,2,4,10};

        for (int num : arr){
            tree.insert(num);
            t2.insert(num);
        }
        tree.postOrderTraversal();
        System.out.println("-------------------");
        tree.preOrderTraversal();
        System.out.println("-------------------");
        tree.inOrder();
//        tree.mergeTress(t2.root);
//        tree.morrisTraversal();
//            tree.morrisPreOrder();
//        System.out.println(tree.flatTree(new ArrayList<>()));
//        System.out.println(tree.getDiaFast());
//            tree.levelOrder();
//        System.out.println(tree.levelOrder());
//        System.out.println((tree.levelOrderTraversal()));
//        tree.getNodesAtK(3);
//        System.out.println(tree.isValidTBST());
//        for (int num : arr2) t2.insert(num);

//        System.out.println(tree.isEqual(t2));
//        System.out.println(tree.findMin());
//        System.out.println(tree.depth(10));
//        System.out.println(tree.height(8));
//        tree.preOrderTraversal();
//        System.out.println(tree.find(10));
//        System.out.println(tree.findLoop(10));
//        System.out.println("Hello");
    }
}

/**
 *              7
 *          3     8
 *       1    2       10
 *              4
 */
