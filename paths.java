package ds;
import java.util.*;

public class paths {
	static class node 
	{
		int data;
		node right;
		node left;
		node(int d)
		{
			data=d;
			right=null;
			left=null;
		}
	}
public static void bt(node root)
{
	List<String> paths=new ArrayList<>();
	if(root==null)
		return ;
	dfs(root,"",paths);
	System.out.println(paths);
	
}
public static void dfs(node root,String s,List<String> paths)
{
	s=s+root.data;
	if(root.left==null && root.right==null)
	{
		paths.add(s);
		return;
	}
	if(root.left!=null)
		dfs(root.left,s+"->",paths);
	 if(root.right!=null)
		 dfs(root.right,s+"->",paths);
	
}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.right=new node(5);
	  bt(root);
		

	}

}
