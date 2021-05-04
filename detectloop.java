package ds;
class dn{
	int data;
	dn next;
}

public class detectloop {
	dn head=null;
	public void insert(int d)
	{
		dn newnode=new dn();
		newnode.data=d;
		newnode.next=head;
		head=newnode;
		
	}
	public void check(){
		dn sptr=head;
		dn fptr=head;
		int f=0,c=1;
		while(sptr!=null && fptr!=null && fptr.next!=null)
		{
			sptr=sptr.next;
			fptr=fptr.next.next;
			c++;
			if(sptr==fptr)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("loop found with length:"+c);
		}
		else
			System.out.println("loop not found");
		
	}
	public void reverse()
	{
		
		if(head==null)
		{
			System.out.println("list is empty");
		}
		
			else
	    	 {
	    		 dn current=head;
	    		 dn pre=null;
	    		 dn post=null;
	    		 while(current!=null)
	    		 {
	    			 post=current.next;
	    			current.next=pre;
	    			pre=current;
	    			current=post;
	    		 }
	    		 head=pre;
	    	 }
       
		
	}
	public void largest()
	{
		
		dn n=head;
		int max=head.next.data;
		while(n.next!=null)
		{
			if(n.data<n.next.data)
			{
				max=n.next.data;
			}
			n=n.next;
		}
		System.out.println("largest is: "+max);
	}
	 public void swap(int x, int y) 
	    { 
	        // Nothing to do if x and y are same 
	        if (x == y) return; 
	  
	        // Search for x (keep track of prevX and CurrX) 
	        dn prevX = null, currX = head; 
	        while (currX != null && currX.data != x) 
	        { 
	            prevX = currX; 
	            currX = currX.next; 
	        } 
	  
	        // Search for y (keep track of prevY and currY) 
	        dn prevY = null, currY = head; 
	        while (currY != null && currY.data != y) 
	        { 
	            prevY = currY; 
	            currY = currY.next; 
	        } 
	  
	        // If either x or y is not present, nothing to do 
	        if (currX == null || currY == null) 
	            return; 
	  
	        // If x is not head of linked list 
	        if (prevX != null) 
	            prevX.next = currY; 
	        else //make y the new head 
	            head = currY; 
	  
	        // If y is not head of linked list 
	        if (prevY != null) 
	            prevY.next = currX; 
	        else // make x the new head 
	            head = currX; 
	  
	        // Swap next pointers 
	        dn temp = currX.next; 
	        currX.next = currY.next; 
	        currY.next = temp; 
	    } 
	public void show()
	{
		dn snode=head;
		while(snode.next!=null)
		{
			System.out.print(snode.data+"->");
			snode=snode.next;
		}
		System.out.println(snode.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detectloop list=new detectloop();
		list.insert(1);
		list.insert(2);
		list.insert(5);
		list.insert(4);
		list.insert(3);
		list.show();
		list.insert(6);
		System.out.println(list.head.next.next.next.data);
		list.head.next.next.next = list.head;
		list.check();
		list.largest();
		list.swap(2,4);
		list.show();
		list.reverse();
		list.show();
		
	}

}
