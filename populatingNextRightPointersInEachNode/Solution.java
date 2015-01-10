import java.util.*;

public class Solution{
  public void connect(TreeLinkNode root){
     if (root == null) return ;
     List<TreeLinkNode> cur = new ArrayList<>();
     cur.add(root);

     while (!cur.isEmpty()){
       List<TreeLinkNode> nextLine = new ArrayList<>();
       for (TreeLinkNode n: cur){
         if (n.left!=null) nextLine.add(n.left);
         if (n.right!=null) nextLine.add(n.right);
       }
       for (int i =0;i<cur.size()-1;i++){
         cur.get(i).next=cur.get(i+1);
       }
       cur.get(cur.size()-1).next=null;
       cur = nextLine;
     }
  }

}
