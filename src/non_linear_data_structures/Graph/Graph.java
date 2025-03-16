package non_linear_data_structures.Graph;

import java.util.*;

enum GRAPH_DIRECTION {
    DIRECTED,
    UNDIRECTED
}


public class Graph {

    private class Node{
        public String value;

        private List<Node> edges;

        public Node(String value) {
            this.value = value;
            this.edges = new ArrayList<>();
        }

        public void addEdges(Node to){
            if (!edges.contains(to))
                this.edges.add(to);
        }

        public List<Node> getChildren(){
            return edges;
        }

        public String toString(){
            return value;
        }
    }

//    private Map<Node, List<Node>> adjacencyList;
    private Map<String, Node> nodes;

    public Graph(){
        this.nodes = new HashMap<>();
    }

    public Node craeteNode(String value) {
        if (!nodes.containsKey(value))
            nodes.put(value, new Node(value));
        return nodes.get(value);
    }

    public void createConnection(Node from, Node to, GRAPH_DIRECTION direction){

        from.addEdges(to);
        if (direction == GRAPH_DIRECTION.UNDIRECTED)
            to.addEdges(from);
    }

    public boolean detectCyclic(Node startingNode){
        List<Node> all = new ArrayList<>();
        Set<String> visiting = new HashSet<>();
        Set<String> visited = new HashSet<>();

        for (var entry: nodes.entrySet()){
                all.add(entry.getValue());
        }

        for (Node n : all){
            if (!visited.contains(n.value))
                if (detectCyclicRec(n, visiting, visited)) return true;
        }
        return false;
    }

    private boolean detectCyclicRec(Node current, Set<String> visiting, Set<String> visited) {
        visiting.add(current.value);

        for (var child : current.getChildren()){
            if (visiting.contains(child.value)) return true;
            detectCyclicRec(child, visiting, visited);
        }
        visiting.remove(current.value);
        visited.add(current.value);
        return false;
    }

    private void getDFS(Node node, Set<String> visited, List<String> result){
        if (node == null || visited.contains(node.value)) return;

        result.add(node.value);
        visited.add(node.value);

        for (Node child : node.getChildren()){
                getDFS(child, visited, result);
        }
    }

    public List<String> getDFS(Node startingNode) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        getDFS(startingNode, visited, result);

        return result;
    }

    public List<String> BFS(Node root){
        Set<String> visited = new HashSet<>();
        Queue<Node> q = new ArrayDeque<>();
        List<String> result = new ArrayList<>();

        q.add(root);
        visited.add(root.value);
        result.add(root.value);

        while (!q.isEmpty()){
            Node current = q.poll();
            for (Node child: current.getChildren()){
                if(!visited.contains(child.value)) {
                    q.offer(child);
                    visited.add(child.value);
                    result.add(child.value);
                }
            }
        }

        return result;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        for (var entry: nodes.entrySet()){
            string.append(entry.getKey()).append(" -> ").append(entry.getValue().getChildren()).append("\n");
        }
        return string.toString();
    }
}
