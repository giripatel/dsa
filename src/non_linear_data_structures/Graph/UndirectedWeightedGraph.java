package non_linear_data_structures.Graph;

import java.util.*;



public class UndirectedWeightedGraph {

    private class Node {
        public String value;
        public List<WeightedEdge> edges;

        public Node(String value) {
            this.value = value;
            this.edges = new ArrayList<>();
        }

        public void addEdge(Node node, int weight) {
            this.edges.add(new WeightedEdge(node, weight));
            node.edges.add(new WeightedEdge(this, weight));
        }

        public List<WeightedEdge> getChildren(){
            return this.edges;
        }

        public String toString() {
            return this.value;
        }
    }

    private class WeightedEdge {
        public Node node;
        public int weight;

        public WeightedEdge(Node node, int weight) {
            this.node = node;
            this.weight = weight;
        }
        public WeightedEdge(Node node) {
            this.weight = 0;
            this.node = node;
        }

        public String toString() {
            return "{ Node : " + node + " " + weight + " }";
        }
    }

    private Map<String, Node> nodes;

    public UndirectedWeightedGraph(){
        this.nodes = new HashMap<>();
    }

    public Node createNode(String value) {
        if (!nodes.containsKey(value)) {
            nodes.put(value, new Node(value));
        }
        return nodes.get(value);
    }

    public void createConnection(Node from, Node to, int weight) {
        from.addEdge(to, weight);
    }

    private boolean helper(ArrayList<ArrayList<Integer>> adj, Set<Integer> visited, int cur, int parent){
        if(visited.contains(cur)) return false;
        visited.add(cur);

        for(int child : adj.get(cur)) {
            if(parent == child) continue;
            if(visited.contains(child) || helper(adj, visited, child, cur)) return true;
        }

        return false;
    }

    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {

        // Set<Integer> visiting = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for(int i = 0; i < adj.size(); i ++)
            if(helper(adj, visited, i, -1)) return true;

        return false;
    }

    private class EdgePair{
        Node node;
        int weight;
        Node parent;

        public EdgePair(Node node, int weight, Node parent){
            this.node = node;
            this.weight = weight;
            this.parent = parent;
        }
    }

    public String dijkastrasAlgo(Node initial, Node toNode){
        Set<Node> visited = new HashSet<>();
        Map<Node, EdgePair> map = new HashMap<>();
        PriorityQueue<EdgePair> pq = new PriorityQueue<>(new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair edgePair, EdgePair t1) {
                return edgePair.weight - t1.weight;
            }
        });

        EdgePair entry = new EdgePair(initial, 0, null);
        pq.add(entry);
        map.put(initial, entry);

        while(!pq.isEmpty()){
            EdgePair cur = pq.poll();

            for (var child : cur.node.edges){
                int newDistance = cur.weight + child.weight;
                if (!map.containsKey(child.node) || newDistance < map.get(child.node).weight){
                    EdgePair newPair = new EdgePair(child.node, newDistance, cur.node);
                    pq.add(newPair);
                    map.put(child.node, newPair);
                }
            }

            visited.add(cur.node);
        }

        StringBuilder sb = new StringBuilder();
        EdgePair tempEntry = map.get(toNode);

        while (tempEntry != null){
            sb.append(tempEntry.node).append(" ");
            tempEntry = map.get(tempEntry.parent);
        }
            sb.append(" = ").append(map.get(toNode).weight);
        return sb.reverse().toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (var entry : nodes.entrySet()){

            for (WeightedEdge edge : entry.getValue().edges)
                sb.append(entry.getKey()).append(" -- ").append(edge.weight).append(" -- ").append(edge.node).append("\n");
        }

        return sb.toString();
    }
}
