package ds;
import java.util.*;
public class mirror {
	static class node{
		node left;
		node right;
		int data;
		node(int d)
		{
			data=d;
			right=null;
			left=null;
		}
	}
public static node mir(node root)
{
	if(root==null)
		return null;
	node t=root.left;
	root.left=root.right;
	root.right=t;
	mir(root.left);
	mir(root.right);
	return root;
}
public static void inorder(node root)
{
	Stack<node> st=new Stack<>();
	node current=root;
	while(current!=null || !st.isEmpty())
	{
		while(current!=null)
		{
			st.push(current);
			current=current.left;
		}
		current=st.pop();
		System.out.print(current.data+" ");
		current=current.right;
	}
}
 int maxlevel=0;
public  void leftv(node root,int level)
{
	
	if(root==null)
		return;
	if(level>=maxlevel)
	{
		System.out.println(root.data);
		maxlevel++;
	}
	
	leftv(root.left,level+1);
	leftv(root.right,level+1);
	
}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.right.left=new node(9);
		root.left.right=new node(5);
		mirror m=new mirror();
		m.leftv(root,0);
		inorder(root);
		node temp=mir(root);
		System.out.println();
		inorder(temp);
		

	}

}
