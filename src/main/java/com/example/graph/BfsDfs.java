package com.example.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsDfs {
    int vertices = 10;

    List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        BfsDfs bfsDfs = new BfsDfs();

        for (int i = 0; i < bfsDfs.vertices; i++) {
            bfsDfs.graph.add(new ArrayList<>());
        }

        bfsDfs.addEdge(0, 1);
        bfsDfs.addEdge(0, 2);
        bfsDfs.addEdge(1, 3);
        bfsDfs.addEdge(1, 4);
        bfsDfs.addEdge(2, 5);
        bfsDfs.addEdge(2, 6);
        bfsDfs.addEdge(3, 7);
        bfsDfs.addEdge(4, 8);
        bfsDfs.addEdge(5, 9);

        System.out.println("BFS starting from vertex 0:");
        bfsDfs.bfs(0);

        System.out.println("\nDFS starting from vertex 0:");
        boolean[] visited = new boolean[bfsDfs.vertices];
        bfsDfs.dfs(0, visited);
    }

    public void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];

        visited[start] = true;

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int current = q.poll();

            System.out.println(current);

            for (int val : graph.get(current)) {
                if (!visited[val]) {
                    q.offer(val);
                    visited[val] = true;
                }
            }
        }
    }

    public void dfs(int start, boolean[] visited) {
        if (visited[start]) {
            return;
        }

        visited[start] = true;

        // Do the thing you want to do at this node
        System.out.println(start);

        for (int val : graph.get(start)) {
            if (!visited[val]) {
                dfs(val, visited);
            }
        }
    }
}
