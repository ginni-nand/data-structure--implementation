package ds;
import java.util.*;
public class prefrompost {
	public static int postindex;
	public static void fillpre(int in[],int post[],int start,int end,Stack<Integer> st)
	{
		if(start>end)
		{
			return;
		}
		int val=post[postindex];
		int index=search(in,val);
		postindex--;
		fillpre(in,post,index+1,end,st);
		fillpre(in,post,start,index-1,st);
		st.push(val);
	}
	public static int search(int in[],int val)
	{
		int i;
		for(i=0;i<in.length;i++)
		{
			if(in[i]==val)
			{
				return i;
			}
			
		}
		return -1;
	}
	public static void  pre(int in[],int post[])
	{
		Stack<Integer> st=new Stack();
		int l=in.length;
		postindex=l-1;
	     fillpre(in,post,0,l-1,st);
		while(st.isEmpty()==false)
		{
			System.out.print(st.pop()+" ");
		}
	}

	public static void main(String[] args) {
		int in[]={4, 2, 5, 1, 3, 6};
		//int pre[]={1, 2, 4, 5, 3, 6 };
		int post[]={4 ,5, 2, 6, 3, 1};
       pre(in,post);
	}

}
