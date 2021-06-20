package ds;
import java.util.*;
public class motherver {
  public static void addedge(int u,int v,ArrayList<ArrayList<Integer>> g)
  {
	  g.get(u).add(v);
  }
  public static void dfs(ArrayList<ArrayList<Integer>> g,int u,boolean visited[])
  {
	  visited[u]=true;
	  for(int x:g.get(u))
	  {
		  if(!visited[x])
		  dfs(g,x,visited);
	  }
  }
  public static int  mother(ArrayList<ArrayList<Integer>> g,int V)
  {
	  boolean visited[]=new boolean[V];
	  int v=0;
	  for(int i = 0; i < V; i++) 
	    { 
	        if (!visited[i]) 
	        { 
	            dfs(g, i, visited); 
	            v = i; 
	        } 
	    } 
	  boolean check[]=new boolean[V];
	  dfs(g,V,check);
	  for(boolean val:check)
	  {
		  if(!val)
		  {
			  return -1;
		  }
	  }
	  return v;
  }
	public static void main(String[] args) {
		int U=7;
		int V=8;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++)
		{
		   adj.add(new ArrayList<Integer>());
		}
		
		addedge(0, 1,adj); 
	    addedge(0, 2,adj); 
	    addedge(1, 3,adj); 
	    addedge(4, 1,adj); 
	    addedge(6, 4,adj); 
	    addedge(5, 6,adj); 
	    addedge(5, 2,adj); 
	    addedge(6, 0,adj); 
	    System.out.println(mother(adj,V));

	}

}
