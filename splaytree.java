package ds;

public class splaytree {
	static class node
	{
		int data;
		node left;
		node right;
		node(int d)
		{
			data=d;
			right=left=null;
		}
	}
	public static node rr(node root)
	{
		node y=root.left;
		root.left=y.right;
		y.right=root;
		return y;
	}
	public static node lr(node root)
	{
		node y=root.right;
		root.right=y.left;
		y.left=root;
		return y;
	}
	public static node splay(node root,int k)
	{
		if(root==null || root.data==k)
			return root;
		if(root.data>k)
		{
			if(root.left==null)
				return root;
			 if(root.left.data>k)//zig-zig
			{
				root.left.left=splay(root.left.left,k);
				root=rr(root);
			}
			else if(root.left.data<k)//zig-zag
			{
				root.left.right=splay(root.left.right,k);
				if(root.left.right!=null)
					root.left=lr(root.left);
			}
			 return (root.left == null)? root: rr(root);
		}
		else
		{
			if(root.right==null)
				return root;
			if(root.right.data<k)//zag-zag
			{
				root.right.right=splay(root.right.right,k);
				root=lr(root);
			}
			else if(root.right.data>k)
			{
				root.right.left=splay(root.right.left,k);
				if(root.right.left!=null)
					root.right=rr(root.right);
			}
			return (root.right==null)?root:lr(root);
		}
	}
	public static node insert(node root,int key)
	{
		if(root==null )
			return new node(key);
		root=splay(root,key);
		if(root.data==key)
			return root;
		node newnode=new node(key);
		if(root.data>key)
		{
			newnode.right=root;
			newnode.left=root.left;
			root.left=null;
		}
		else
		{
			 newnode.left = root; 
		        newnode.right = root.right; 
		        root.right = null;
		}
		return newnode;
	}
	public static node del(node root,int key)
	{
		node temp;
		if(root==null)
		{
			return null;
		}
		root=splay(root,key);
		if (key != root.data) 
	        return root; 
		
		if(root.left==null)
		{
			temp=root;
			root=root.right;
		}
		else
		{
			temp=root;
			root=splay(root.left,key);
			root.right=temp.right;
		}
		temp=null;
		return root;
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
		// TODO Auto-generated method stub
		/*node root=new node(100);
		root.left=new node(50);
		root.left.left=new node(40);
		root.left.left.left=new node(30);
		root.left.left.left.left=new node(20);
		root.right=new node(200);
		node r=insert(root,25);
		preorder(r);
		System.out.println();*/
		node root =new  node(6); 
	    root.left = new node(1); 
	    root.right = new node(9); 
	    root.left.right = new node(4); 
	    root.left.right.left = new node(2); 
	    root.right.left = new node(7); 
	    preorder(root);
		root=del(root,4);
		System.out.println();
		preorder(root);

	}

}
