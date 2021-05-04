package ds;
import java.util.*;
public class delnode {
	public class dno{
		int data;
		dno left;
		dno right;
	}
	public dno cre(int key)
	{
		dno b=new dno();
		b.data=key;
		b.left=null;
		b.right=null;
		return b;
	}
	public static void inorder(dno node)
	{//using stack
		/*Stack <dno>st=new Stack<>();
		dno curr=node;
		while(curr!=null || !st.isEmpty())
		{
			while(curr!=null)
			{
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			System.out.println(curr.data);
			curr=curr.right;
			//System.out.println(curr.data);
		}*/
		dno pre;
		dno curr;
		if(node==null)
			return;
		curr=node;
		while(curr!=null)
		{
			if(curr.left==null)
			{
				System.out.print(curr.data);
				curr=curr.right;
			}
			else{
				pre=curr.left;
				while(pre.right!=null && pre.right!=curr)
				{
					pre=pre.right;
				}
				if(pre.right==null)
				{
					pre.right=curr;
					curr=curr.left;
				}
				else{
					pre.right=null;
					System.out.print(curr.data);
					curr=curr.right;
				}
					
			}
		}
		
	}
	public static int height(dno node)
	{
		if(node==null)
		{
			return -1;
		}
		return max(height(node.left),height(node.right))+1;
	}
	public static  int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static  void levelorder(dno node)
	{
		if(node==null)
			return;
		int h=height(node);
		for(int i=0;i<=h;i++)
		{
			printlevel(node,i+1);
			System.out.println();
		}
	}
	public static void printlevel(dno node,int level)
	{
		if(node==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.print(node.data);
		}
		printlevel(node.left,level-1);
		printlevel(node.right,level-1);
	}
	public static void main(String[] args) {
		delnode a=new delnode();
		dno root=a.cre(1);
		root.left=a.cre(2);
		root.left.left=a.cre(4);
		root.left.left.right=a.cre(6);
		root.right=a.cre(3);
		root.right.left=a.cre(5);
		inorder(root);
		//levelorder(root);
		

	}

}
