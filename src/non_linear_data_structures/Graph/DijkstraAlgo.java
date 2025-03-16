package non_linear_data_structures.Graph;

import java.util.ArrayList;
import java.util.*;

public class DijkstraAlgo {
    private class iPair {
        int first, second;

        iPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

   private class EdgeEntry {
        int node;
        int weight;
        int parent;

        public EdgeEntry(int node, int weight, int parent) {
            this.node = node;
            this.weight = weight;
            this.parent = parent;
        }
    }

    // User function Template for Java
        // Function to find the shortest distance of all the vertices
        // from the source vertex src.

        ArrayList<Integer> dijkstraMethod1(ArrayList<ArrayList<iPair>> adj, int src) {
            // Write your code here
            ArrayList<Integer> result = new ArrayList<>();
            if(adj.size() < 1) return result;
            Set<Integer> vis = new HashSet<>();
            Map<Integer, EdgeEntry> map = new HashMap<>();
            PriorityQueue<EdgeEntry> pq = new PriorityQueue<>(new Comparator<EdgeEntry>(){
                //@override
                public int compare(EdgeEntry e1, EdgeEntry e2) {
                    return e1.weight - e2.weight;
                }
            });

            EdgeEntry entry = new EdgeEntry(src, 0, -1);
            pq.add(entry);
            map.put(src, entry);

            while(!pq.isEmpty()){
                EdgeEntry top = pq.poll();

                if(vis.contains(top.node)) continue;

                for(iPair child : adj.get(top.node)){
                    int newDis = top.weight + child.second;

                    if(!map.containsKey(child.first) || newDis <  map.get(child.first).weight) {
                        entry = new EdgeEntry(child.first, newDis, top.node);
                        pq.add(entry);
                        map.put(child.first, entry);
                    }
                }

                vis.add(top.node);
            }


            for(var val : map.entrySet()){
                result.add(val.getValue().weight);
            }

            return result;
        }

    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<>();

        PriorityQueue<EdgeEntry> pq = new PriorityQueue<>(new Comparator<EdgeEntry>(){

            public int compare(EdgeEntry e1, EdgeEntry e2){
                return e1.weight - e2.weight;
            }
        });

        Map<Integer, Integer> distance = new HashMap<>();

        pq.add(new EdgeEntry(src, 0, -1));
        distance.put(src, 0);

        while(!pq.isEmpty()) {
            EdgeEntry entry = pq.poll();
            int currentNode = entry.node;
            int currentDis = entry.weight;

            if(distance.containsKey(currentNode) && distance.get(currentNode) < currentDis) {
                continue;
            }

            for(iPair child : adj.get(currentNode)) {

                int newDistance = currentDis + child.second;

                if(!distance.containsKey(child.first) || newDistance < distance.get(child.first)){
                    pq.add(new EdgeEntry(child.first, newDistance, currentNode));
                    distance.put(child.first, newDistance);
                }
            }
        }

        for(Map.Entry<Integer, Integer> entry : distance.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
    }
