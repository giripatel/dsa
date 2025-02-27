package revision.Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class MainTree {
    Node root;

    public void insert(int data){
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            while (true) {
                if (data <= root.data) {
                    if (root.left == null) {
                        root.left = node;
                        break;
                    }
                    root = root.left;
                } else {
                    if (root.right == null) {
                        root.right = node;
                        break;
                    }
                    root = root.right;
                }
            }
        }
    }

    public Node insertRec(Node root, int value){
        if(root == null) {
            root = new Node(value);
            return root;
        }

        if (value <= root.data) {
            root.left = insertRec(root.left, value);
        }else {
            root.right = insertRec(root.right, value);
        }

        return root;
    }
 
    public void insertRec(int value) {
        root = insertRec(root,value);
    }

    private void print(Node root){
        if (root == null) {
            return;
        }

        System.out.println(root.data);

        print(root.left);
        print(root.right);
    }

    public void print(){
        print(root);
    }

    public List<List<Integer>> levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> mL = new LinkedList<>();
        boolean isLeft = false;

        queue.offer(root);
        int qSize = 0;

        while(!queue.isEmpty()){
            List<Integer> iL = new LinkedList<>();
            qSize = queue.size();

            for (int i = 0; i < qSize; i ++){
                Node node = queue.poll();
                if (isLeft) iL.add(node.data);
                else iL.add(0,node.data);

//                iL.add(node.data);
                if (node.left != null){
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

            }
            mL.add(iL);
            isLeft = !isLeft;
        }

        return mL;
    }
}