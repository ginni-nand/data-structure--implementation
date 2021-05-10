package ds;

public class llink2l {
	public Node2 head;
	public void insert(int data)
	{
		Node2 newnode=new Node2();
		
		newnode.data=data;
		newnode.next=null;
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node2 n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
		}
		
	}
	  public int search( int x) 
	     { 
	         Node2 current = head;
	         int i=0;
	         boolean flag=false;
	         if(head==null)
	         {
	        	 System.out.println("khaliiii h");
	         }
	         else{
	         while (current != null) 
	         { 
	             if (current.data == x) 
	             {
	            	 flag=true;
	            	 return i;
	             }
	             i++;
	             current = current.next; 
	         } 
	         }
	
	        	 return i;
	     } 
	public void insertafter(int index,int data)
	{
		Node2 newnode=new Node2();
		newnode.data=data;
		newnode.next=null;
		
    	 if(index==0)
    	 {
    		newnode.next=head;
    			 head=newnode;
    	 }
    		 else
    		 {
    			 Node2 n=head;
    			 for(int i=0;i<index;i++)
    			 {
    				 n=n.next;
    			 }
    			 newnode.next=n.next;
    			 n.next=newnode;
    		 }
    	 
		
	}
	public void show()
	{
		Node2 snode=new Node2();
		snode=head;
		while(snode.next!=null)
		{
			System.out.println(snode.data);
			snode=snode.next;
		}
		System.out.println(snode.data);
	}

}
