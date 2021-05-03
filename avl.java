package ds;

public class avl {
	static class node{
		node right;
		node left;
		int data;
		int height;
		node(int d)
		{
			data=d;
			height=1;
		}
	}
  public static node insert(node root,int key)
  {
	  if(root==null)
		  return (new node(key));
	  if(root.data<key)
		  root.right=insert(root.right,key);
	  else if(root.data>key)
		  root.left=insert(root.left,key);
	  else
		  return root;
	  root.height=1+max(height(root.left),height(root.right));
	  int b=getb(root);
      if (b > 1 && key < root.left.data)  
          return rr(root);  

      // Left Right Case  
      if (b > 1 && key > root.left.data)  
      {  
          root.left = lr(root.left);  
          return rr(root);  
      }  

      // Right Right Case  
      if (b < -1 && key > root.right.data)  
          return lr(root);  

      // Right Left Case  
      if (b < -1 && key < root.right.data)  
      {  
          root.right = rr(root.right);  
          return lr(root);  
      }  
	  return root;
  }
  public static node lr(node root)
  {
	  node y=root.right;
	  node t2=y.left;
	  y.left=root;
	  root.right=t2;
	  
	  root.height=max(height(root.left),height(root.right))+1;
	  y.height=max(height(y.left),height(y.right))+1;
	  
	return y;
  }
  public static node rr(node root)
  {
	  node y=root.left;
	  node t2=y.right;
	  y.right=root;
	  root.left=t2;
	  root.height=max(height(root.left),height(root.right))+1;
	  y.height=max(height(y.left),height(y.right))+1;
	  
	  return y;
	  
  }
  public static int height(node root)
  {
	  if(root==null)
		  return 0;
	  return root.height;
  }
  public static int getb(node root)
  {
	  if(root==null)
	  {
		  return 0;
	  }
	  return height(root.left)-height(root.right);
  }
  public static int max(int a,int b)
  {
	  return a>b?a:b;
  }
  public static void preorder(node root)
  {
	  if(root==null)
		  return ;
	  System.out.print(root.data+" ");
	  preorder(root.left);
	  preorder(root.right);
  }
	public static void main(String[] args) {
		node root=null;
		root = insert(root, 9);
        root = insert(root, 5); 
        root = insert(root, 10); 
        root = insert(root, 0); 
        root = insert(root, 6); 
        root = insert(root, 11);
        root = insert(root, -1);
        root = insert(root, 1);
        root = insert(root, 2);
        preorder(root);

	}

}
