import java.util.*;
public class Solution{
  public boolean isSymmtric(TreeNode root){
    LinkedList<TreeNode> l = new LinkedList<>();
    LinkedList<TreeNode> r = new LinkedList<>();

    if (root == null) return true;
    l.add(root.left);
    r.add(root.right);

    while(!l.isEmpty()&& !r.isEmpty()){
       TreeNode t1 = l.poll();
       TreeNode t2 = r.poll();
       if ((t1 == null&&t2 !=null)||(t1!=null&&t2==null)) return false;
       if (t1!=null) {
         if (t1.val!=t2.val) {
           return false;   
         }
         l.add(t1.left);
         l.add(t1.right);
         r.add(t2.right);
         r.add(t2.left);
       }
    }
     return true;
  }
}
