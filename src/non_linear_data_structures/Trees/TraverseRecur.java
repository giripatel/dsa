package non_linear_data_structures.Trees;

import java.util.*;

class TNode{
    int data;
    TNode leftChild;
    TNode rightChild;

    public TNode(int data) {
        this.data = data;
    }

    public String toString(){
        return "value="+data;
    }
}


// GET DIAMETER CLASS
class Pair{
    int dia;
    int height;

    public Pair(int dia, int height){
        this.dia = dia;
        this.height = height;
    }
}

public class TraverseRecur {
    private TNode root;

    public TraverseRecur(){
        this.root = null;
    }

    public TNode add(TNode tree, int value){
        if (tree == null){
            tree = new TNode(value);
            return tree;
        }
        if (value <= tree.data){
            tree.leftChild = add(tree.leftChild, value);
        }else {
            tree.rightChild = add(tree.rightChild, value);
        }

        return tree;
    }

    public void insert(int value){
        root = add(root,value);
    }

    private  TNode find(TNode root, int value){
        if (root == null) return  null;

        if (root.data == value) return  root;

        if (value < root.data){
            return find(root.leftChild, value);
        }
        return find(root.rightChild, value);
    }

    public TNode find(int value){
        return find(root,value);
    }

    public TNode findLoop(int value){
        while (true){
            if (root == null) return null;
            if (root.data == value) return root;
            if (root.data < value){
                root = root.leftChild;
            } else {
                root = root.rightChild;
            }
        }
    }

    private void preOrderTraversal(TNode root){
        if (root == null) return;

        System.out.println(root.data);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private int depth(TNode root, int value, int depth){
        if (root == null) return -1;

        if (root.data == value) return  depth;

        if (value <= root.data){
            return depth(root.leftChild, value, depth + 1);
        }
        return depth(root.rightChild, value, depth + 1);
    }

    public int depth(int value){
        return depth(root, value, 0);
    }

    private int heightOfTheTree(TNode root){
        if (root == null) return  -1;

        return 1 + Math.max(heightOfTheTree(root.leftChild), heightOfTheTree(root.rightChild));
    }

    private int height(TNode root, int height, int value){
        if (root == null) return -1;

        if (root.data == value) return height;

        if (value <= root.data) {
           return height(root.leftChild, height -1, value);
        }

        return height(root.rightChild, height -1, value);

    }

    public int height(int value) {
        return height(root,heightOfTheTree(root),value);
    }

    private TNode findMin(TNode root){
        if (root == null) return null;
        if (root.leftChild == null) return root;
        return findMin(root.leftChild);
    }

    public TNode findMin(){
        return findMin(root);
    }

    private boolean isEqual(TNode r1, TNode r2){
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;

        return r1.data == r2.data &&
                isEqual(r1.leftChild, r2.leftChild) &&
                isEqual(r1.rightChild, r2.rightChild);
    }

    public boolean isEqual(TraverseRecur r2) {
        return isEqual(root, r2.root);
    }

    //VALIDATE BINARY SEARCH TREE
    private boolean isValidTree(TNode root, int min, int max){
        if (root == null) return true;

        if (root.data <= min || root.data >= max) return false;
        return isValidTree(root.leftChild,min,max) && isValidTree(root.rightChild, min, max);
    }

    public boolean isValidTBST(){
        return isValidTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void getNodesAtK(TNode root, int k){
        if (root == null) return;

        if (k == 0){
            System.out.println(root.data);
            return;
        }
        k--;
        getNodesAtK(root.leftChild,k);
        getNodesAtK(root.rightChild,k);
    }

    public void getNodesAtK(int k){
        getNodesAtK(root,k);
    }

    public List<List<Integer>> levelOrderTraversal(){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> ll = new ArrayList<>();
            TNode node = queue.poll();
//            System.out.println(node.data);
//            ll.add(node.data);
            if (node.leftChild != null){
                queue.offer(node.leftChild);
            }
            if (node.rightChild != null){
                queue.offer(node.rightChild);
            }
            list.add(ll);
        }

        return list;
    }

    public void levelOrder(){
        Queue<TNode> queue = new ArrayDeque<>();
        if (root == null) return;
        queue.offer(root);

        while (!queue.isEmpty()){

            TNode node = queue.poll();
            System.out.println(node.data);

            if (node.leftChild != null)
                queue.offer(node.leftChild);
//                root = root.leftChild;
            if (node.rightChild != null)
                queue.offer(node.rightChild);
//                root = root.rightChild;
        }
    }

    // GET DIAMETER Start
    private int diameter(TNode root){
        if (root == null) return 0;

        int leftDia = diameter(root.leftChild);
        int rightDia = diameter(root.rightChild);

        int myDia = heightForDia(root.leftChild) + heightForDia(root.rightChild) + 1;

        return Math.max(leftDia, Math.max(rightDia, myDia));
    }

    private int heightForDia(TNode root){
        if (root == null) return  0;

        return 1 + Math.max(heightForDia(root.leftChild), heightForDia(root.rightChild));
    }

    public int diameter(){
        return diameter(root);
    }


    private Pair getDiaFast(TNode root){
        if (root == null) return new Pair(0,0);

        Pair leftChild = getDiaFast(root.leftChild);
        Pair rightChild = getDiaFast(root.rightChild);

        int height = leftChild.height + rightChild.height + 1;

        int result = Math.max(leftChild.dia, Math.max(rightChild.dia, height));
        int myHeight = Math.max(leftChild.height, rightChild.height) + 1;

        return new Pair(result, myHeight);
    }

    public int getDiaFast(){
        return getDiaFast(root).dia;
    }

    // GET DIAMETER END
    /*
    private int findMin(TNode root, int value){
        if (root == null) return -1;

        if (root.leftChild == null) {
            return root.data > value ? value : root.data;
        } else if (value < root.data){
            return findMin(root.leftChild,value);
        } else {
            return findMin(root.leftChild, root.data);
        }
    }

    public int findMin(){
        if (root == null) return -1;
        return findMin(root,root.data);
    }
  */
}
