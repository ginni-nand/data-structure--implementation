package ds;

public class levelor {
	static class node{
		int data;
		node right;
		node left;
		node(int d)
		{
			data=d;
			right=left=null;
		}
	}
	public static node leveldo(node root,int key)
	{
		if(root==null)
		{
			root=new node(key);
			return root;
		}
		if(key<root.data)
			root.left=leveldo(root.left,key);
		else if(key>root.data)
			root.right=leveldo(root.right,key);
		return root;
	}
	
public static node construct(int a[],int n)
{
	
	if(n==0)
		return null;
	node root=null;
	for(int i=0;i<n;i++)
	{
		root=leveldo(root,a[i]);
	}
	return root;
	
	
}
public static int height(node root)
{
	if(root==null)
		return 0;
	return height(root.left)+height(root.right)+1;
}
public static void inord(node root)
{
	if(root==null)
		return ;
	inord(root.left);
	System.out.print(root.data+" ");
	inord(root.right);
}
	public static void main(String[] args) {
		int l[]={11,6,13,5,12,10};
		node temp=construct(l,l.length);
		inord(temp);
		int h=height(temp);
		System.out.println();
		if(l.length==h)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
