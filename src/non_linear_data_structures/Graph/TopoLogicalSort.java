package non_linear_data_structures.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoLogicalSort {
        // Function to return list containing vertices in Topological order.
   /* static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < adj.size(); i ++){
            helper(adj, i, visited, stack);
        }

        for(int i = 0; i < adj.size(); i ++){
            result.add(stack.pop());
        }

        return result;
    }

    private static void helper(ArrayList<ArrayList<Integer>> adj, int vertex, Set<Integer> visited, Stack<Integer> stack)
    {
        if(visited.contains(vertex)) return;

        visited.add(vertex);

        for(int edge : adj.get(vertex)){
            helper(adj, edge, visited, stack);
        }

        stack.push(vertex);
    } */

    // Khan's Algo
        static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {

            ArrayList<Integer> result = new ArrayList<>();

            if(adj.size() <= 0) return result;

            int[] id = new int[adj.size()];
            Queue<Integer> q = new LinkedList<>();

            for(int i = 0; i < adj.size(); i ++) {
                for(int child : adj.get(i)){
                    id[child]++;
                }
            }

            for(int i = 0; i < adj.size(); i ++)
            {
                if(id[i] == 0) q.offer(i);
            }

            while(!q.isEmpty())
            {
                int current = q.poll();
                result.add(current);

                for(int child : adj.get(current))
                {
                    id[child] --;

                    if(id[child] == 0) q.offer(child);
                }
            }

            return result;
        }
}
