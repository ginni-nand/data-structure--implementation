package ds;
class nd{
	nd next;
	int data;
	nd prev;
}

public class doublecll {
	nd head;
   public  void insertend(int value)
   {
	   nd newnode=new nd();
	   newnode.data=value;
	   if(head==null)
	   {
		   newnode.next=newnode.prev=newnode;
		   head=newnode;
		   return;
	   }
	   else
	   {
		   nd n=head;
		   while(n.next!=head)
		   {
			   n=n.next;
		   }
		   n.next=newnode;
		   newnode.next=head;
		   newnode.prev=n;
		   head.prev=newnode;
	   }
   }
   public void insertbegin(int value)
   {
	   nd newnode=new nd();
	   newnode.data=value;
	   newnode.next=head;
	   newnode.prev=head.prev;
	   head.prev.next=newnode;
	   head.next.prev=newnode.next;
	   head=newnode;
	   
   }
   public void show()
   {
	   nd snode=head;
	   while(snode.next!=head)
	   {
		   System.out.print(snode.data+"->");
		   snode=snode.next;
	   }
	   System.out.println(snode.data);
   }
   public nd insertatindex(int index,int val)
   {
	   nd newnode=new nd();
	   newnode.data=val;
	   if(index==0)
	   {
		   return head;
	   }
	   else{
		   nd n=head;
		   for(int i=1;i<index-1;i++)
		   {
			   n=n.next;
		   }
		   newnode.prev=n.next;
		   n.next.prev=newnode;
		   n.next=newnode;
		   newnode.prev=n;
		   return head;
		   
	   }
	   
   }
	public static void main(String[] args) {
		doublecll list=new doublecll();
		list.insertend(32);
		list.insertend(23);
		list.insertend(98);
		list.insertend(4);
		list.insertend(31);
		list.show();
		System.out.println("List after insert at begin: ");
		list.insertbegin(13);
		list.show();
		System.out.println("list after inserting at index: ");
		list.insertatindex(3, 12);
		list.show();
	}

}
