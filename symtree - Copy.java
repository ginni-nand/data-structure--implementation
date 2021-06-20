package ds;

public class symtree {
	static class st{
		st right;
		st left;
		int data;
		st(int d)
		{
			data=d;
			right=null;
			left=null;
		}
	}
	public static boolean ismirror(st node1,st node2)
	{
		if(node1==null && node2==null)
		{
			return true;
		}
		if(node1!=null && node2!=null && node1.data==node2.data)
		{
			return (ismirror(node1.left,node2.right)&& ismirror(node1.right,node2.left));
		}
		return false;
	}
	public static boolean issem(st root)
	{
		return (ismirror(root,root));
	}

	public static void main(String[] args) {
		st root=new st(1);
		root.right=new st(2);
		root.left=new st(2);
		root.left.left=new st(3);
		root.left.right=new st(4);
		root.right.left=new st(4);
		root.right.right=new st(2);
		System.out.println(issem(root));
		
	}

}
