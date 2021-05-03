package ds;
import java.util.*;
import java.io.*;
public class bfs {
	private int V;   // No. of vertices 
    private LinkedList<Integer> adj[]; //Adjacency Lists 
  
    // Constructor 
   bfs(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
   public void added(int u,int w)
   {
	   adj[u].add(w);
   }
   public void work(int start)
   {
	   boolean vist[]=new boolean[V];
	   LinkedList<Integer> queue=new LinkedList<>();
	   vist[start]=true;
	   queue.add(start);
	   while(queue.size!=0)
	   {
		   start=queue.poll();
		   System.out.print(start+" ");
		   
		   Iterator<Integer> i = adj[s].listIterator(); 
		   while (i.hasNext()) 
           { 
               int n = i.next(); 
               if (!vist[n]) 
               { 
                   vist[n] = true; 
                   queue.add(n); 
               } 
           } 
	   }
	   
   }

	public static void main(String[] args) {
		bfs g=new bfs(4);
		g.added(0,1);

	}

}
