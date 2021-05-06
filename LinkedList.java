package ds;


public class LinkedList {
     Node head;
     public void insert(int data)
     {
    	 Node newnode=new Node();
    	 newnode.data=data;
    	 newnode.next=null;
     
     if(head==null)
     {
    	 head=newnode;
     }
     else
     {
    	 Node n=head;
    	 while(n.next!=null)
    	 {
    		 n=n.next;
    	 }
    	 n.next=newnode;
     }
    }
     public void insertatstart(int data)
     {
    	 Node newnode=new Node();
    	 newnode.data=data;
    	 newnode.next=null;
    	 newnode.next=head;
    	 //if(head==null)
    	 //{
    	 head=newnode;
    	 //}
    	 
     }
     public void insertatindex(int index, int data)
     {
    	 Node newNode=new Node();
    	 newNode.data=data;
    	 newNode.next=null;
    	 if(index==0)
    	 {
    		newNode.next=head;
    			 head=newNode;
    	 }
    		 else
    		 {
    			 Node n=head;
    			 for(int i=0;i<index-1;i++)
    			 {
    				 n=n.next;
    			 }
    			 newNode.next=n.next;
    			 n.next=newNode;
    		 }
    	 
     }
     public void sortedlist(int data)
     {
    	 Node newsnode=new Node();
    	 newsnode.data=data;
    	 newsnode.next=null;
    	 if(head==null || head.data>=newsnode.data)
    	 {
    		 newsnode.next=head;
    		 head=newsnode;
    	 }
    	 else
    	 {
    		 Node n=head;
    		 while(n.next!=null && n.next.data<newsnode.data)
    		 {
    			 n=n.next;
    		 }
    		 newsnode.next=n.next;
    		 n.next=newsnode;
    	 }
     }
     /*public void deleteat(int index)
     {
    	 if(index==0)
    	 {
    		 head=head.next;
    	 }
    	 else
    	 {
    		 Node  n=head;
    		 Node n1=null;
    		 for(int i=0;i<index-1;i++)
    		 {
    			 n=n.next;
    			 
    		 }
    		 n1=n.next;
    		 n.next=n1.next;
    		 n1=null;
    	 }
     }*/
     public void search( int x) 
     { 
         Node current = head;
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
            	 break;
             }
             i++;
             current = current.next; 
         } 
         }
         if(flag)
         {
        	 System.out.println("Element at index "+i);
         }
         else
        	 System.out.println("not foundddd");
           
     } 
     public void reverse()
     {
    	 if(head==null)
    	 {
    		 System.out.println("list is empty");
    	 }
    	 else
    	 {
    		 Node current=head;
    		 Node pre=null;
    		 Node post=null;
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
     public void show()
     {
    	 Node gnode=head;
    	 while(gnode.next!=null)
    	 {
    		 System.out.print(gnode.data+"->");
    		 gnode=gnode.next;
    	 }
    	 System.out.println(gnode.data);
     }
}
