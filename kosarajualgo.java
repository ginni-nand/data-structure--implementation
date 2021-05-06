package ds;
import java.util.*;
import java.util.LinkedList;
public class kosarajualgo {
	private int V;
	private LinkedList<Integer> adj[];
	kosarajualgo(int v)
	{ 
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList();
		}
	}
	public void addedge(int v,int u)
	{
		adj[v].add(u);
	}
	public void fill(int v,boolean visit[],Stack st)
	{
		visit[v]=true;
		Iterator<Integer> i=adj[v].iterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(visit[n]==false)
			{
				fill(n,visit,st);
			}
		}
		st.push(new Integer(v));
	}
	public kosarajualgo trans()
	{
		kosarajualgo gr=new kosarajualgo(V);
		
		for(int v=0;v<V;v++)
		{
			Iterator<Integer> i=adj[v].iterator();
			while(i.hasNext())
			{
				gr.adj[i.next()].add(v);
			}
		}
		return gr;
	}
	public void dfs(int v,boolean visit[])
	{
		visit[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> i=adj[v].iterator();
		int n;
		while(i.hasNext())
		{
			 n=i.next();
			if(!visit[n])
			{
				dfs(n,visit);
			}
		}
	}
public void printscc()
{Stack st=new Stack();
	boolean vist[]=new boolean[V];
	for(int i=0;i<V;i++)
	{
		vist[i]=false;
	}
	for(int i=0;i<V;i++)
	{
		if(vist[i]==false)
		{
		  fill(i,vist,st);	
		}
	}
	kosarajualgo gt=trans();
	for(int i=0;i<V;i++)
	{
		vist[i]=false;
	}
	while(st.isEmpty()==false)
	{
		int v=(int)st.pop();
		if(vist[v]==false)
		{
			gt.dfs(v,vist);
			System.out.println();
		}
	}
	
	
}
	public static void main(String[] args) {
		kosarajualgo g=new kosarajualgo(5);
		g.addedge(1, 0);
		g.addedge(0, 2);
		g.addedge(2, 1);
		g.addedge(0, 3);
		g.addedge(3, 4);
		 System.out.println("yeh answer h:");
		 g.printscc();

	}

}
