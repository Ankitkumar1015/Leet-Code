import java.util.*;

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        // Create adjacency list
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Build the graph
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1];
            double prob = succProb[i];
            graph.get(a).add(new Pair(b, prob));
            graph.get(b).add(new Pair(a, prob));
        }
        
        // Max heap to store probabilities
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        pq.offer(new Pair(start, 1.0));
        
        // Keep track of visited nodes and their probabilities
        double[] probabilities = new double[n];
        probabilities[start] = 1.0;
        
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            double prob = current.prob;
            
            if (node == end) return prob;
            
            if (prob < probabilities[node]) continue;
            
            for (Pair neighbor : graph.get(node)) {
                double newProb = prob * neighbor.prob;
                if (newProb > probabilities[neighbor.node]) {
                    probabilities[neighbor.node] = newProb;
                    pq.offer(new Pair(neighbor.node, newProb));
                }
            }
        }
        
        return 0.0;
    }
    
    private class Pair {
        int node;
        double prob;
        
        public Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }
}