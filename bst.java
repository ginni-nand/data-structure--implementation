package ds;

public class bst {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
			right=null;
			left=null;
		}
	}
	static Node root;
	bst()
	{
	   root=null;
	}
	public static void insert(int d)
	{
		root=insertrec(root,d);
	}
	public static Node insertrec(Node root,int d)
	{
		if(root==null)
		{
			root=new Node(d);
			return root;
		}
		if(root.data>d)
			root.left=insertrec(root.left,d);
		else if(root.data<d)
	      root.right=insertrec(root.right,d);
		return root;
	}
	public static Node search(Node  root,int key)
	{
		if(root==null || root.data==key)
		{
			return root;
		}
		if(root.data>key)
			return search(root.left,key);
		return search(root.right,key);
			
	}
public static void inorder(Node temp)
{
	if(temp==null)
		return;
	inorder(temp.left);
	System.out.print(temp.data+" ");
	inorder(temp.right);
}
public static Node right(Node root)
{
	while(root!=null && root.right!=null)
	{
		root=root.right;
	}
	return root;
}
public static Node left(Node root)
{
	while(root!=null && root.left!=null)
	{
		root=root.left;
	}
	return root;
}
public static void del(int key)
{
	root=delrec(root,key);
}
public static Node delrec(Node root,int key)
{
	if(root==null)
		return root;
	if(root.data>key)
		root.left=delrec(root.left,key);
	else if(root.data<key)
		root.right=delrec(root.right,key);
	else
	{
		if(root.right==null)
		{
			return root.left;
		}
		else if(root.left==null)
			return root.right;
		root.data=min(root.right);
		root.right=delrec(root.right,root.data);
	}
	return root;
}
public static int min(Node root)
{
	int m=root.data;
	while(root.left!=null){
		m=root.left.data;
		root=root.left;
	}
	return m;
}

	public static void main(String[] args) {
		bst tree=new bst();
		tree.insert(100);
		tree.insert(500);
		tree.insert(400);
		tree.insert(300);
		tree.insert(450);
		tree.insert(600);
		tree.insert(550);
		tree.insert(800);
		tree.insert(20);
		tree.insert(30);
		tree.insert(10);
		inorder(root);
		System.out.println();
		System.out.println(((search(root,20)).right).data);
		System.out.println(right(root).data);
		System.out.println(left(root).data);
		//tree.del(20);
		//tree.inorder(root);
		tree.del(100);
		System.out.println();
		tree.inorder(root);

	}

}
