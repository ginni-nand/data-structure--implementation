package ds;
import java.util.*;
public class bsttobalance {
	
	static class node{
		node right;
		node left;
		int data;
		node(int d)
		{
			data=d;
			right=left=null;
		}
	}
	public static void inod(node root)
	{
		if(root==null)
			return;
		
		inod(root.left);
		System.out.print(root.data+" ");
		
		inod(root.right);
	}
	public static void putnodes(node root,Vector <node> v)
	{
		if(root==null)
			return;
		putnodes(root.left,v);
		v.add(root);
		putnodes(root.right,v);
	}
	public static node buildtree(Vector<node> v,int start,int end)
	{
		if(start>end)
			return null;
		int mid=(start+end)/2;
		node root=v.get(mid);
		root.left=buildtree(v,start,mid-1);
		root.right=buildtree(v,mid+1,end);
		return root;
	}
	public static node build(node root)
	{
		Vector<node> v=new Vector<>();
		putnodes(root,v);
		int n=v.size();
		return buildtree(v,0,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 node root = new node(10); 
	        root.left = new node(8); 
	        root.left.left = new node(7); 
	        root.left.left.left = new node(6); 
	        root.left.left.left.left = new node(5); 
     //inod(root);
     //System.out.println();
     node temp=build(root);
     inod(temp);
	}

}
