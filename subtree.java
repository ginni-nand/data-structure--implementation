package ds;

public class subtree {
	static class node{
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
public static boolean sub(node r2,node r1)
{
	if(r2==null)
		return false;
	else if(dow(r2,r1))
		return true;
	else
	{
		return sub()
	}
}
	public static void main(String[] args) {
		node root=new node(1);
		root.right=new node(2);
		root.left=new node(3);
		root.left.left=new node(4);
		root.left.left.left=new node(1);
		root.left.left.right=new node(2);
		node r2=new node(4);
		r2.left=new node(1);
		r2.right=new node(2);
		sub(r2,root);

	}

}
