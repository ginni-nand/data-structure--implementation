package ds;

public class avlinsert {
	static class node{
		node left;
		node right;
		int data;
		int height;
		node(int d)
		{
			data=d;
			height=1;
		}
	}
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static int height(node root)
	{
		if(root==null)
			return 0;
		return root.height;
	}
	public static int getbalance(node root)
	{
		if(root==null)
			return 0;
		return height(root.left)-height(root.right);
	}
	public static node insert(node root,int key)
    {
		if (root == null)  
            return (new node(key));  
  
        if (key < root.data)  
            root.left = insert(root.left, key);  
        else if (key > root.data)  
           root.right = insert(root.right, key);  
        else // Equal keys not allowed  
            return root;  
  
        /* 2. Update height of this ancestor node */
       root.height = 1 + max(height(root.left),  
                            height(root.right));  
  
        /* 3. Get the balance factor of this ancestor  
        node to check whether this node became  
        balanced */
        int balance = getbalance(root);  
  
        // If this node becomes unbalanced, then  
        // there are 4 cases Left Left Case  
        if (balance > 1 && key < root.left.data)  
            return rotateright(root);  
  
        // Right Right Case  
        if (balance < -1 && key > root.right.data)  
            return rotateleft(root);  
  
        // Left Right Case  
        if (balance > 1 && key > root.left.data)  
        {  
            root.left = rotateleft(root.left);  
            return rotateright(root);  
        }  
  
        // Right Left Case  
        if (balance < -1 && key < root.right.data)  
        {  
            root.right = rotateright(root.right);  
            return rotateleft(root);  
        }  
  
        /* return the (unchanged) node pointer */
        return root;  
    }
	public static node rotateleft(node x)
	{
		node y = x.right; 
        node T2 = y.left; 
  
        // Perform rotation 
        y.left = x; 
        x.right = T2; 
  
        //  Update heights 
        x.height = max(height(x.left), height(x.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
  
        // Return new root 
        return y; 
	}
	public static node rotateright(node y)
	{
		node x = y.left; 
        node T2 = x.right; 
  
        // Perform rotation 
        x.right = y; 
        y.left = T2; 
  
        // Update heights 
        y.height = max(height(y.left), height(y.right)) + 1; 
        x.height = max(height(x.left), height(x.right)) + 1; 
  
        // Return new root 
        return x; 
	}
	public static void preorder(node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	/*public static node del(node root,int key)
	{
		if (root == null)  
            return root;  
  
        // If the key to be deleted is smaller than  
        // the root's key, then it lies in left subtree  
        if (key < root.data)  
            root.left = del(root.left, key);  
  
        // If the key to be deleted is greater than the  
        // root's key, then it lies in right subtree  
        else if (key > root.data)  
            root.right = del(root.right, key);  
  
        // if key is same as root's key, then this is the node  
        // to be deleted  
        else
        {  
  
            // node with only one child or no child  
            if ((root.left == null) || (root.right == null))  
            {  
                node temp = null;  
                if (temp == root.left)  
                    temp = root.right;  
                else
                    temp = root.left;  
  
                // No child case  
                if (temp == null)  
                {  
                    temp = root;  
                    root = null;  
                }  
                else // One child case  
                    root = temp; // Copy the contents of  
                                // the non-empty child  
            }  
            else
            {  
  
                // node with two children: Get the inorder  
                // successor (smallest in the right subtree)  
                node temp = min(root.right);  
  
                // Copy the inorder successor's data to this node  
                root.data = temp.data;  
  
                // Delete the inorder successor  
                root.right = del(root.right, temp.data);  
            }  
        }  
  
        // If the tree had only one node then return  
        if (root == null)  
            return root;  
  
        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE  
        root.height = max(height(root.left), height(root.right)) + 1;  
  
        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether  
        // this node became unbalanced)  
        int balance = getbalance(root);  
  
        // If this node becomes unbalanced, then there are 4 cases  
        // Left Left Case  
        if (balance > 1 && getbalance(root.left) >= 0)  
            return rotateright(root);  
  
        // Left Right Case  
        if (balance > 1 && getbalance(root.left) < 0)  
        {  
            root.left = rotateright(root.left);  
            return rotateright(root);  
        }  
  
        // Right Right Case  
        if (balance < -1 && getbalance(root.right) <= 0)  
            return rotateleft(root);  
  
        // Right Left Case  
        if (balance < -1 && getbalance(root.right) > 0)  
        {  
            root.right = rotateright(root.right);  
            return rotateleft(root);  
        }  
  
        return root;  
		*/
	//}
	/*public static node min(node root)
	{
		 
		while(root.left!=null){
			root=root.left;
		}
		return root;
	}*/
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
        //root=del(root,10);
        //System.out.println();
        //preorder(root);
  
	}

}
