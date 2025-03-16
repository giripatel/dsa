package non_linear_data_structures.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    public String value;
    public List<WeightedEdge> edges;

    public Node(String value) {
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Node node, int weight) {
        this.edges.add(new WeightedEdge(node, weight));
    }

    public List<WeightedEdge> getChildren(){
        return this.edges;
    }

    public String toString() {
        return this.value;
    }
}

class WeightedEdge {
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
}

public class WeightedGraph {

    private Map<String, Node> nodes;

    public WeightedGraph(){
        this.nodes = new HashMap<>();
    }

    public Node createNode(String value) {
        if (!nodes.containsKey(value)) {
            nodes.put(value, new Node(value));
        }
        return nodes .get(value);
    }

    public void createConnection(Node from, Node to, int weight) {
        from.addEdge(to, weight);
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
