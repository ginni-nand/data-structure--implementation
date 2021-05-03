package ds;

public class constructtree {

	static class node{
		int data;
		node left;
		node right;
		node(int d)
		{
			data=d;
		}
	}
	static int preindex;
	public static node construct(int pre[],int post[],int l,int h,int size)
	{
		//preindex=0;
		if(preindex>=size || l>h)
		{
			return null;
		}
		node root=new node(pre[preindex]);
		preindex++;
		if(l==h|| preindex>=size)
		{
			return root;
		}
		int i;
		for(i=l;i<=h;i++)
		{
			if(post[i]==pre[preindex])
			{
				break;
			}
		}
		if(i<=h)
		{
			root.left=construct(pre,post,l,i,size);
			root.right=construct(pre,post,i+1,h,size);
		}
		return root;
	}
	public static void inorder(node temp)
	{
		if(temp==null)
			return;
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	public static node cont(int pre[],int post[],int size)
	{
		preindex=0;
		return construct(pre,post,0,size-1,size);
	}
	
	public static void main(String[] args) {
		int post[]={4,5,2,6,3,1};
		int pre[]={1,2,4,5,3,6};
		int size=post.length;
		
		node root=cont(pre,post,size);
		System.out.println("inorder triversal");
		inorder(root);

	}

}
