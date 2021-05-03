package ds;

public class bsttodll {
	static class node {
		node right;
		node left;
		int data;
		node(int d)
		{
			data=d;
			right=left=null;
		}
	}
	static class lnode{
		lnode next;
		lnode prev;
		int d;
	}
	static node pv;
	static node head;
	public static node con(node nd)
	{
		
		if(nd==null)
			return null;
		con(nd.left);
		if(pv==null)
		{
			head=nd;
			pv=nd;
		}
		else
		{
			nd.left=pv;
			pv.right=nd;
			pv=nd;
		}
		con(nd.right);
		return head;
	}
public static void show(node t)
{
	node r=t;
	while(r.right!=null)
	{
		System.out.print(r.data+" ");
		r=r.right;
	}
	System.out.print(r.data);
}
public static void preorder(node root)
{
	if(root==null)
		return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
	public static void main(String[] args) {
	  
		node root=new node(12);
		root.right=new node(24);
		root.left=new node(7);
		root.left.left=new node(2);
		root.left.right=new node(8);
		preorder(root);
		System.out.println();
		node t=con(root);
		show(t);
	}

}
