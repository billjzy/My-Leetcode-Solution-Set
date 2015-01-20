import java.util.*;
//using hashmap to map the original nodes and cloned nodes
//handy to track objects and eliminate duplicants
public class Solution{
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
    if (node == null) return null;
    Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
    UndirectedGraphNode head = new UndirectedGraphNode(node.label);
    map.put(node, head);
    LinkedList<UndirectedGraphNode> list = new LinkedList<>();
    list.add(node);
    while (!list.isEmpty()) {
      UndirectedGraphNode temp = list.pollFirst();
      for (UndirectedGraphNode n : temp.neighbors){
         if (!map.containsKey(n)){
           list.add(n);
           map.put(n, new UndirectedGraphNode(n.label));
         }
         map.get(temp).neighbors.add(map.get(n));
      }
    }
  return head;
  }
}
