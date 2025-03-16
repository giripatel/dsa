package non_linear_data_structures.Graph;

public class Main {
    public static void main(String[] args) {
        UndirectedWeightedGraph graph = new UndirectedWeightedGraph();

        var a = graph.createNode("a");
        var b = graph.createNode("b");
        var c = graph.createNode("c");
        var d = graph.createNode("d");
        var e = graph.createNode("e");

        graph.createConnection(a, b, 1);
        graph.createConnection(b, c, 10);
        graph.createConnection(c, d, 9);
        graph.createConnection(c, a, 3);
        graph.createConnection(b, e, 4);
        graph.createConnection(b, d, 4);
        graph.createConnection(d, e, 6);
        
        System.out.println(graph.dijkastrasAlgo(b,c));
     /*   Graph graph = new Graph();

        var a = graph.craeteNode("A");
        var b = graph.craeteNode("B");
        var c = graph.craeteNode("C");
        var d = graph.craeteNode("D");
        var e = graph.craeteNode("E");
        var f = graph.craeteNode("F");
        var g = graph.craeteNode("G");

        graph.createConnection(a, b, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(a, c, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(b, d, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(b, e, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(d, g, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(e, f, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(c, f, GRAPH_DIRECTION.DIRECTED);

        // CYCLIC DETECTION
      /*  graph.createConnection(a, b, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(b, c, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(c, d, GRAPH_DIRECTION.DIRECTED);
        graph.createConnection(d, a, GRAPH_DIRECTION.DIRECTED);

        System.out.println(graph);
        System.out.println(graph.detectCyclic(a));
        System.out.println("BFS : " + graph.BFS(a));
        System.out.println("DFS : " + graph.getDFS(a));

        */

    }
}
