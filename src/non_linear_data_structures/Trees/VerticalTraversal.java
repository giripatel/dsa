package non_linear_data_structures.Trees;

import java.util.*;

public class VerticalTraversal {
    //Function to find the vertical order traversal of Binary Tree.

    static ArrayList<Integer> verticalOrder(VNode root)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<VPair> qu = new ArrayDeque<>();

        qu.offer(new VPair(0, root));

        while(!qu.isEmpty()){
            VPair cur = qu.poll();
            //   map.put(hd, root.data);
            if(map.containsKey(cur.hd)){
                map.get(cur.hd).add(cur.node.data);
            } else{
                ArrayList<Integer> ls = new ArrayList<>();
                ls.add(cur.node.data);
                map.put(cur.hd, ls);
            }

            if(cur.node.left != null){
                qu.offer(new VPair(cur.hd - 1, cur.node.left));
            }

            if(cur.node.right != null){
                qu.offer(new VPair(cur.hd + 1, cur.node.right));
            }
        }

        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            for(int val : entry.getValue()){
                list.add(val);
            }
        }

        return list;

    }
}

class VPair{
    int hd;
    VNode node;

    public VPair(int hd, VNode node){
        this.hd = hd;
        this.node = node;
    }
}

class VNode{
    int data;
    VNode left;
    VNode right;

    public VNode(int data){
        this.data = data;
    }
}