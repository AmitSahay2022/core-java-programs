package com.data_structure;

public class TestGraph {
    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("A","D");
        graph.addEdge("B","D");
        graph.addEdge("C","D");
        graph.addEdge("B","C");

        graph.removeVertex("D");
        graph.printGraph();

        graph.removeEdge("A","B");
        graph.printGraph();
    }
}
