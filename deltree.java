package ds;
import java.util.LinkedList;
import java.util.Queue;
public class deltree {
	static class td{
		int data;
		td right;
		td left;
		td(int k){
			data=k;
			left=null;
			right=null;
		}
	}
	public static void inorder(td node)
	{
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	
    public static void delnode(td root,int key)
    {
    	if(root==null)
    		return ;
    	if(root.left==null && root.right==null)
    	{
    		if(root.data==key)
    		{
    			
    			return ;
    		}
    		else
    		return ;
    	}
    	Queue<td> q=new LinkedList<td>();
    	q.add(root);
    	td temp=null;
    	td keynode=null;
    	td pr=null;
    	td pl=null;
    	
    	while(!q.isEmpty())
    	{
    		temp=q.peek();
    		q.poll();
    		if(temp.data==key)
    		{
    			keynode=temp;
    		}
    		if(temp.left!=null)
    		{
    			q.add(temp.left);
    			pl=temp;
    			pr=null;
    		}
    		if(temp.right!=null)
    		{
    			q.add(temp.right);
    			pr=temp;
    			pl=null;
    		}
    	}
    	if(keynode!=null)
    	{
    		keynode.data=temp.data;
    		if(pl!=null)
    			pl.left=null;
    		if(pr!=null)
    			pr.right=null;
    		
    	}
    	
    	
    }
	public static void main(String[] args) {
		td root;
		root=new td(10);
		root.left=new td(11);
		root.left.left=new td(7);
		root.left.right=new td(12);
		root.right=new td(9);
		root.right.left=new td(15);
		root.right.right=new td(8);
		System.out.println("inorder befor");
		inorder(root);
		delnode(root,10);
		System.out.println("inorder after ");
		inorder(root);
		
		
	}

}
