package com.qburst.data_strucure.graph;

import java.util.ArrayList;

/**
 * Created by albinmathew on 29/10/14.
 */
public class GraphExample {
    public static void main(String[] args){

        Graph graph1 = new Graph(10);
        Graph graph2 = new Graph(20);

        graph1.addNode(1);
        graph1.addNode(2);
        graph1.addNode(3);
        graph1.addNode(4);
        graph1.addNode(5);

        graph2.addNode(6);
        graph2.addNode(7);
        graph2.addNode(8);
        graph2.addNode(9);
        graph2.addNode(10);

        ArrayList<GraphNode> nodes = graph1.nodes;
        printNodes(nodes);

        System.out.println("Is Graph directed : "+graph1.isDirected);
        System.out.println("Size of graph1 : "+graph1.size);
    }
    public static void printNodes(ArrayList<GraphNode> nodes){
        for(int i=0; i< nodes.size();i++){
           GraphNode graphNode = nodes.get(i);
           System.out.println(graphNode.data);
        }
    }
}
