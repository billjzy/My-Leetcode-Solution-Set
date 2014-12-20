import java.util.*;
//using hashmap to map the original nodes and cloned nodes
//handy to track objects and eliminate duplicants
public class Solution{
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
    if (node == null) return null;
    HashMap<UndirectedGraphNode, UndirectedGraphNode> mp = new HashMap<>();
    UndirectedGraphNode head = new UndirectedGraphNode(node.label);
    mp.put(node, head);

    LinkedList<UndirectedGraphNode> list = new LinkedList<>();
    list.add(node);

    while (!list.isEmpty()){
      UndirectedGraphNode temp = list.pollFirst();
      for (UndirectedGraphNode n : temp.neighbors){
         if (!mp.containsKey(n)) {
            list.add(n);
            mp.put(n, new UndirectedGraphNode(n.label));
         }
         mp.get(temp).neighbors.add(mp.get(n));
      }
    }
    return head;
  }
}
