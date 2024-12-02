package src.app;

import java.util.*;

public class Graph {

    private final List<List<Integer>> graph;
    private int vertexCount;

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        this.graph = new ArrayList<>();
        for (int i = 0; i < vertexCount; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    public void removeEdge(int source, int destination) {
        graph.get(source).remove(Integer.valueOf(destination));
        graph.get(destination).remove(Integer.valueOf(source));
    }

    public void addVertex() {
        graph.add(new ArrayList<>());
        vertexCount++;
    }

    public void removeVertex(int vertex) {
        for (int neighbor : graph.get(vertex)) {
            graph.get(neighbor).remove(Integer.valueOf(vertex));
        }
        graph.remove(vertex);
        vertexCount--;

        for (List<Integer> neighbors : graph) {
            for (int i = 0; i < neighbors.size(); i++) {
                if (neighbors.get(i) > vertexCount) {
                    neighbors.set(i, neighbors.get(i) - 1);
                }
            }
        }
    }

    public boolean hasVertex(int vertex) {
        return vertex >= 0 && vertex < vertexCount;
    }

    public boolean hasEdge(int source, int destination) {
        return graph.get(source).contains(destination);
    }

    public int getVertexCount() {
        return vertexCount;
    }
    public void printGraph() {
        for (int i = 0; i < vertexCount; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}