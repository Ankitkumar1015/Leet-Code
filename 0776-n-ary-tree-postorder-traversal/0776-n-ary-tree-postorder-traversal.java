import java.util.*;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        postorderTraversal(root, result);
        return result;
    }
    
    private void postorderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        
        // Traverse children
        for (Node child : node.children) {
            postorderTraversal(child, result);
        }
        
        // Add current node's value
        result.add(node.val);
    }
}