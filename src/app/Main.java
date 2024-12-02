package src.app;

public class Main {
    public static void main(String[] args) {
        Graph graphSpaceFighter = new Graph(14);

        graphSpaceFighter.addEdge(0, 1);
        graphSpaceFighter.addEdge(1, 2);
        graphSpaceFighter.addEdge(2, 3);
        graphSpaceFighter.addEdge(3, 4);
        graphSpaceFighter.addEdge(4, 5);
        graphSpaceFighter.addEdge(5, 6);
        graphSpaceFighter.addEdge(6, 7);
        graphSpaceFighter.addEdge(7, 8);
        graphSpaceFighter.addEdge(8, 9);
        graphSpaceFighter.addEdge(9, 10);
        graphSpaceFighter.addEdge(10, 11);
        graphSpaceFighter.addEdge(11, 12);
        graphSpaceFighter.addEdge(12, 13);
        graphSpaceFighter.addEdge(13, 0);
        graphSpaceFighter.addEdge(13, 8);
        graphSpaceFighter.addEdge(1, 0);

        graphSpaceFighter.getVertexCount();
        System.out.println("Number of vertices in the Space Fighter design: " + graphSpaceFighter.getVertexCount());
        System.out.println();

        System.out.println("Space Fighter design: ");
        graphSpaceFighter.printGraph();
        System.out.println();

        System.out.println("Removing edge between 13 and 8");
        graphSpaceFighter.removeEdge(13, 8);

        System.out.println("Space Fighter design after removing edge between 13 and 8: ");
        graphSpaceFighter.printGraph();
        System.out.println();

        System.out.println("Adding a new vertex");
        graphSpaceFighter.addVertex();
        System.out.println("Space Fighter design after adding a new vertex: ");
        graphSpaceFighter.printGraph();
        System.out.println();

        System.out.println("Removing vertex 14");
        graphSpaceFighter.removeVertex(14);
        System.out.println("Space Fighter design after removing vertex 14: ");
        graphSpaceFighter.printGraph();
        System.out.println();

      //  Check is Vertex present in the graph
        System.out.println("Vertex 11 is in the Space Fighter design: " + graphSpaceFighter.hasVertex(11));
        System.out.println();

        // Check is Edge present in the graph
        System.out.println("Edge between 1 and 2 is in the Space Fighter design: "
                + graphSpaceFighter.hasEdge(1, 2));
    }
}
