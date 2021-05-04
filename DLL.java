package ds;

public class DLL {
	

	class Node{
		Node prev;
		Node next;
		int data;
		Node(int d)
		  {
			data=d;
		  }
	   }
	Node head,tail;
	public void insertatbegin(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=tail=newnode;
			newnode.prev=tail;
			tail=newnode;
			tail.next=null;
		}
		else{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
			tail.next=null;
		}
		
	}
	public void append(int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		Node n=head;
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else{
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
			newnode.prev=n;
			n=newnode;
		}
	}
	public void reverese()
	{
		Node  temp=null;
		Node current=head;
		while(current!=null)
		{
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		if(temp!=null)
		{
			head=temp.prev;
		}
		
	}
public void deletelast()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return;
	}
	else
	{
		Node n=head;
		if(head!=tail){

		
		while(n.next!=null)
		{
			n=n.next;
		}
		n=n.prev;
		n.next=null;
		}
		
	
	else{
		head= n =null;
	}
	}
}

public void removeindex(Node nodetodelete)
{
	if(head==null || nodetodelete==null)
	{
		System.out.println("list is empty");
	}
	else if(head==nodetodelete && nodetodelete.prev==null)
	{
		removefirst();
	}
	else if(nodetodelete.next==null)
	{
		removelast();
	}
	else{
		nodetodelete.next.prev=nodetodelete.prev;
		nodetodelete.prev.next=nodetodelete.next;
		nodetodelete=null;
	}
	
}
	public void show()
	{
		Node snode=head;
		System.out.println("values   are:   ");
		while(snode.next!=null)
		{
			System.out.print(snode.data +" -->");
			snode=snode.next;
		}
		System.out.println(snode.data);
	}
	public void insertatindex(Node prevnode,int data)
	{
		if(prevnode==null)
		{
			System.out.println("Error");
			return;
		}
		Node newnode=new Node(data);
		newnode.next=prevnode.next;
		prevnode.next=newnode;
		newnode.prev=prevnode;
		if(newnode.next!=null)
		newnode.next.prev=newnode;
		
	}
	public void insertbefore(Node givennode,int data)
	{
		Node newnode=new Node(data);
		newnode.prev=givennode.prev;
		givennode.prev=newnode;
		newnode.next=givennode;
		if(newnode.prev!=null)
		{
			newnode.prev.next=newnode;
		}
		
	}
	public Node search(int key)
	{
		Node current=head;
		int i=0;
		boolean flag;
		if(head==null)
		{
			System.out.println("emptyy");
		}
		else {
			while(current!=null)
			{
				if(current.data==key)
				{
					flag=true;
					return current;
					
				}
				i++;
				current=current.next;
				
			}
		}
		return current;
	}
	public void removefirst()
	{
		if(head==null)
		{
			System.out.println("Empty list");
			return;
		}
		else if(head!=tail)
		{
			head=head.next;
			head.prev=null;
		}
		else
		{
			head=null;
			tail=null;
		}
	}
	public void removelast()
	{
		//Node n=head;
		if(head == null) {  
            return;  
        }  
        else {
        	Node n=head;
        	while(n.next!=null)
        	{
        		n=n.next;
        	}
              
            if(head != n) {  
                
                n = n.prev;  
                
                n.next = null;  
            }  
             
            else {  
                head = n = null;  
            }  
        }  
		
	}
	 static Node deleteNode(Node head, Node del)  
	    { 
	       
	        if (head == null || del == null) 
	            return null; 
	  
	      
	        if (head == del) 
	            head = del.next; 
	  
	        
	  
	        if (del.next != null) 
	            del.next.prev = del.prev; 
	  
	        if (del.prev != null) 
	            del.prev.next = del.next; 
	  
	        del = null; 
	  
	        return head; 
	    }  

	public Node removeno(int k)
	{
		Node n=head;
		Node m;
		while(n!=null)
		{
			if(n.data==k)
			{
				m=n.next;
				deleteNode(head,n);
				n=m;
			}
			else{
				n=n.next;
			}
			
		}
		return head;
	}
	public static void main(String args[])
	{
		DLL list=new DLL();
		list.insertatbegin(2);
		list.insertatbegin(2);
		list.insertatbegin(10);
		list.insertatbegin(8);
		list.insertatbegin(4);
		list.insertatbegin(2);
		list.insertatbegin(5);
		list.insertatbegin(2);
		list.show();
		list.removeno(2);
		list.show();
		//list.append(55);
		//list.show();
		/*list.insertatindex(list.head, 99);
		list.show();
		list.insertbefore(list.head.next, 4);
		list.show();
		Node index=list.search(12);
        System.out.println("value is: "+index.data);
        list.removeindex(index);
        list.show();
        list.removefirst();
        list.show();
        list.removelast();
        list.show();
        System.out.println("reverse:");
        list.reverese();
        list.show();
       // list.delateatindex(index);
       // list.show();*/
		
	}
}
