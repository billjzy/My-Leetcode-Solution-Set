import java.util.*;

public class dfsSolution{
  public String getPermutation(int n,int k){
     ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>> ();
     
     for (int i=1;i<=n;i++){
        ArrayList<Integer> perm=new ArrayList<Integer> ();
        boolean []visit = new boolean[n+1];
        visit[i]=true;
        perm.add(i);
        int num =1;
        dfs(list, perm, visit, n, num );
     }
     
     return list.get(k-1).toString();
  }
  public  void  dfs(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> perm,boolean [] visit, int n, int count ){
     if (count==n){
       list.add(perm);
       return;  
     }
     for (int j=1;j<=n ;j++){
       if (!visit[j]){
         ArrayList<Integer> temp=new ArrayList<Integer>(perm); 
         temp.add(j);
         visit[j]=true;
         dfs(list, temp, visit, n , count+1);
         visit[j]=false;
       }
     }

  }

  
  public static void main(String [] args){
    dfsSolution kthPerm=new dfsSolution();
    System.out.print(kthPerm.getPermutation(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
  }
}
