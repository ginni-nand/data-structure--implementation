package ds;

public class bstin {
	static class node{
		int data;
		node right;
		node left;
	}
	public static void inorder(node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
  public static node insert(node root,int d)
  {
	  if(root==null)
	  {
		  node temp=new node();
		  temp.data=d;
		  temp.right=temp.left=null;
		  return temp;
	  }
	  if(d<root.data)
	  {
		  root.left=insert(root.left,d);
	  }
	  if(d>root.data)
	  {
		 root.right= insert(root.right,d);
	  }
	  return root;
	  
  }
  public static node del(node root,int key)
  {
	  if(root==null)
	  {
		  System.out.print("not found");
		  return null;
	  }
	  if(root.data<key)
	  {
		  root.right=del(root.right,key);
	  }
	  else if(root.data>key)
	  {
		  root.left=del(root.left,key);
	  }
	  else
	  {
		  node temp=null;
		  if(root.left==null && root.right==null)
		  {
			 return null;
		  }
		  else if(root.left==null)
		  {
			  temp=root.right;
			  return temp;
		  }
		  else if(root.right==null)
		  {
			  temp=root.left;
			  return temp;
		  }
		  temp=min(root.right);
		  root.data = temp.data;
		  root.right=del(root.right,temp.data);
		  
	  }
	  return root;
	  
  }
  public static node min(node root)
  {
	  node temp=root;
	  while(temp.left!=null)
	  {
		  temp=temp.left;
	  }
	  return temp;
  }
	public static void main(String[] args) {
		 node root = null;
		  root = insert(root, 25);
		  root = insert(root, 15);
		  root = insert(root, 50);
		  root = insert(root, 10);
		  root = insert(root, 22);
		  root = insert(root, 35);
		  root = insert(root, 70);
		  inorder(root);
		  System.out.println();
		  node r=del(root,25);
		  inorder(r);
	}

}
