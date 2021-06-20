package ds;
import java.util.*;
import java.util.LinkedList; 

import java.util.Stack; 
public class que {
    static Queue <Integer> q = new LinkedList<Integer>();
    
    public static /*Queue<Integer>*/ void  reverse(Queue<Integer>q)
    {
    	/*Stack<Integer> st=new Stack<>();
    	while(!q.isEmpty())
    	{
  		st.push(q.peek());
  		q.remove();
    	}
    	while(!st.isEmpty())
    	{
    		q.add(st.pop());
    	}
    	//return q;*/
    	int a[]=new int[q.size()];
    	int i=0;
    	while(q.isEmpty())
    	{
    		a[i]=q.poll();
    		q.remove();
    		i++;
    	}
    	for(int j=a.length-1;j>=0;j--)
    	{
    		q.add(a[j]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       q.add(10);
       q.add(20);
       q.add(30);
       q.add(40);
       reverse(q);
      // System.out.println("gxdfg");
       while(!q.isEmpty())
       {
    	   System.out.println(q.peek());
    	   q.remove();
       }
       
	}

}
