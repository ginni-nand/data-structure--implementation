package ds;
import java.util.*;
import java.util.LinkedList;
public class tree1stbinary {
	static class tre{
		int data;
		tre left;
		tre right;
		public tre(int x)
		{
			data=x;
			left=right=null;
		}
	}
	static tre root;
	static tre temp=root;
	
	public static  void inorder(tre temp)
	{
		if(temp==null)
			return;
		inorder(temp.left);
		System.out.println(temp.data+" ");
		inorder(temp.right);
		
	}
	public static  void insert(tre temp,int key)
	{
		Queue<tre> q=new LinkedList<>();
		q.add(temp);
		while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove();
		
		if(temp.left==null)
		{
			temp.left=new tre(key); 
			break;
		}
		else
			q.add(temp.left);
		if(temp.right==null)
		{
			temp.right=new tre(key);
			break;
		}
		else
			q.add(temp.right);
		}
		
	}

	public static void main(String[] args) {
		tree1stbinary l=new tree1stbinary();
		root = new tre(10); 
        root.left = new tre(11); 
        root.left.left = new tre(7); 
        root.right = new tre(9); 
        root.right.left = new tre(15); 
        root.right.right = new tre(8); 
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root); 
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root); 
		
	}

}
