package ds;
import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeMap;
public class topview {
	static class node{
		node right;
		node left;
		int h;
		int data;
		node(int data)
		{
			this.data=data;
			right=null;
			left=null;
		}
	}
	public static  void top(node root)
	{
		if(root==null)
			return;
		Queue<node> q=new LinkedList<>();
		TreeMap<Integer,Integer> tr=new TreeMap<>();
		q.add(root);
		while(!q.isEmpty())
		{
			node temp=q.remove();
			int hd=temp.h;
			if(tr.get(hd)==null)
			{
				tr.put(hd,temp.data);
			}
			if(temp.left!=null)
			{
				temp.left.h=hd-1;
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				temp.right.h=hd+1;
				q.add(temp.right);
			}
			
		}
		System.out.print(tr.values());
	}
	public static void bot( node root)
	{
		if(root==null)
			return ;
		Queue<node> qt=new LinkedList<>();
		TreeMap<Integer,Integer> t=new TreeMap<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			node temp=qt.remove();
			int hd=temp.h;
			t.put(hd, temp.data);
			if (temp.left != null) {
		        temp.left.h=hd - 1;
		        qt.add(temp.left);
		      }

		      if (temp.right != null) {
		        temp.right.h = hd + 1;
		        qt.add(temp.right);
		      }
		}
		System.out.print(t.values());
	}

	public static void main(String[] args) {
		node root=new node(3);
		root.left=new node(5);
		root.right=new node(6);
		root.right.left=new node(2);
		top(root);
		System.out.println();
		bot(root);

	}

}
