package ds;


public class postfrom {
	public static int search(int in[],int start,int end,int data)
	{
	   for(int i=start;i<=end;i++)
	   {
		   if(in[i]==data)
		   {
			   return i;
		   }
	   }
	   return -1;
	}
	 public static int index=0;
	public static  void post(int in[],int pre[],int start,int end)
	{
		
		 if(start>end)
		{
			return;
		}
		int root=search(in,start,end,pre[index++]);
		//System.out.print(in[root]+" ");
		post(in,pre,start,root-1);
		post(in,pre,root+1,end);
		System.out.print(in[root]+" ");
	}

	public static void main(String[] args) {
		int in[]={4, 2, 5, 1, 3, 6};
		int pre[]={1, 2, 4, 5, 3, 6 };
		//int post[]={4 ,5, 2, 6, 3, 1};
		int n=in.length;
		//System.out.println("preorder is");
	System.out.println("postorder is:");
		post(in,pre,0,n-1);
	}

}
