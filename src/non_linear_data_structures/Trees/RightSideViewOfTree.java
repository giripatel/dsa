package non_linear_data_structures.Trees;

import java.util.*;

public class RightSideViewOfTree {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideViewUnOpt(VNode root) {
        List<Integer> list = new LinkedList<>();

        if(root == null) return list;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<VPair> qu = new LinkedList<>();

        qu.offer(new VPair(0, root));

        while(!qu.isEmpty()){
            VPair cur = qu.poll();

            map.put(cur.hd,cur.node.data);

            if(cur.node.left != null){
                qu.offer(new VPair(cur.hd - 1, cur.node.left));
            }

            if(cur.node.right != null){
                qu.offer(new VPair(cur.hd - 1, cur.node.right));
            }
        }

        for(var entry : map.entrySet()){
            list.add(0,entry.getValue());
        }

        return list;
    }

    public List<Integer> rightSideView(VNode root) {
        List<Integer> list = new LinkedList<>();

        if(root == null) return list;
        Queue<VNode> qu = new LinkedList<>();

        qu.offer(root);

        while(!qu.isEmpty()){
            int quSize = qu.size();
            for(int i = 0; i < quSize; i ++){

                VNode node = qu.poll();
                if((i+1) == quSize) list.add(node.data);

                if(node.left != null){
                    qu.offer(node.left);
                }

                if(node.right != null){
                    qu.offer(node.right);
                }
            }
        }

        return list;
    }

}
