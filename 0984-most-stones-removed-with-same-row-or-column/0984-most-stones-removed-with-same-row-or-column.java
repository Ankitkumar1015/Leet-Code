import java.util.*;

class Solution {
    class DisjointSet {
        private Map<Integer, Integer> parent;
        private Map<Integer, Integer> rank;

        public DisjointSet() {
            parent = new HashMap<>();
            rank = new HashMap<>();
        }

        public void makeSet(int x) {
            parent.put(x, x);
            rank.put(x, 0);
        }

        public int find(int x) {
            if (!parent.containsKey(x)) {
                makeSet(x);
            }
            if (parent.get(x) != x) {
                parent.put(x, find(parent.get(x)));
            }
            return parent.get(x);
        }

        public void union(int x, int y) {
            int xRoot = find(x);
            int yRoot = find(y);
            if (xRoot == yRoot) return;

            if (rank.get(xRoot) < rank.get(yRoot)) {
                parent.put(xRoot, yRoot);
            } else if (rank.get(xRoot) > rank.get(yRoot)) {
                parent.put(yRoot, xRoot);
            } else {
                parent.put(yRoot, xRoot);
                rank.put(xRoot, rank.get(xRoot) + 1);
            }
        }
    }

    public int removeStones(int[][] stones) {
        DisjointSet ds = new DisjointSet();
        for (int[] stone : stones) {
            ds.union(stone[0], ~stone[1]); // Use ~stone[1] to differentiate column keys from row keys
        }
        Set<Integer> uniqueRoots = new HashSet<>();
        for (int[] stone : stones) {
            uniqueRoots.add(ds.find(stone[0]));
        }
        return stones.length - uniqueRoots.size();
    }
}