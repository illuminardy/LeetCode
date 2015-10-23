/***** Problem Statement for LeetCode 133 *****/
// Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        
        if (node == null) return null;
        
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        UndirectedGraphNode newHead = new UndirectedGraphNode(node.label);
        queue.add(node);
        map.put(node, newHead);
        
        while (!queue.isEmpty()){
            
            // Peek top node
            UndirectedGraphNode current = queue.poll();
            
            for (UndirectedGraphNode aNeighbor : current.neighbors){
                if (!map.containsKey(aNeighbor)){
                    queue.add(aNeighbor);
                    UndirectedGraphNode newNeighbor = new UndirectedGraphNode(aNeighbor.label);
                    map.put(aNeighbor, newNeighbor);
                }
                
                map.get(current).neighbors.add(map.get(aNeighbor));
            }
        }
        
        return newHead;
    }
}