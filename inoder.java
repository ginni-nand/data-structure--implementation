package ds;

public class inoder {
	static class node{
		int data;
		node left;
		node right;
		public node(int d)
		{
			data=d;
			right=null;
			left=null;
		}
	}
	static class prev{
		node pnode;
		prev()
		{
			pnode=null;
		}
	}
	public static void inorder(node temp,prev pre,int k)
	{
		//if(temp.right!=null)
		//{
			//inorder(temp.right,pre,k);
			
		//}
		if(temp.data==k)
		{
			
			System.out.println("inorder successor of " +k +" is: "+ (pre.pnode != null ? pre.pnode.data : "null")); 
		    
		}
		pre.pnode=temp;
		if(temp.left!=null)
		{
			inorder(temp.left,pre,k);
		}
		//if(temp.data==k)
		//{
			
			//System.out.println("inorder successor of " +k +" is: "+ (pre.pnode != null ? pre.pnode.data : "null")); 
		    
		//}
		//pre.pnode=temp;
		if(temp.right!=null)
		{
			inorder(temp.right,pre,k);
			
		}
		//if(temp.left!=null)
		//{
			//inorder(temp.left,pre,k);
		//}
	}
	public static void main(String args[])
	{
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.right=new node(6);
		prev pre=new prev();
		inorder(root,pre,2);
	}

}
