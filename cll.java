package ds;
class nod
{
	int data;
	nod next;
}
public class cll {
 nod head=null;
 nod tail=null;
 public nod inertbegin(int d)
 {
	 nod newnode=new nod();
	 newnode.data=d;
	 if(head==null)
	 {
		 head=newnode;
		 tail=newnode;
		 tail.next=head;
	 }
	 else
	 {
		newnode.next=head;
		head=newnode;
		tail.next=head;
	 }
	 return head;
 }
 public nod insertend(int d)
 {
	 nod newnode=new nod();
	 newnode.data=d;
	/* if(head==null)
	 {
		
		 head=newnode;
		 tail=newnode;
		 tail.next=head;
		 
	 }*/
	 //else{
		/* nod n=head;
		 while(n.next!=head)
		 {
			 n=n.next;
		 }
		 n.next=newnode;
		 newnode.next=head;*/
	 //}
	 if(head==null )
	 {
		 head=newnode;
		 tail=newnode;
		 tail.next=head;
	 }
	 else{
		 tail.next=newnode;
		 tail=newnode;
		 tail.next=head;
		
	 }
	 return head;
 }
 /*public  void insert(int d)
 {
	 nod newnode=new nod();
	 newnode.data=d;
	 newnode.next=null;
	 if(head==null )
	 {
		 head=newnode;
		 tail=newnode;
		 tail.next=head;
	 }
	 else{
		 tail.next=newnode;
		 tail=newnode;
		 tail.next=head;
		
	 }
	 
 }*/
 public void show()
 {
	 nod snode=head;
	 while(snode.next!=head)
	 {
		 System.out.print(snode.data+"->");
		 snode=snode.next;
	 }
	 System.out.println(snode.data);
 }
 public void search(int val)
 {
	 nod n=head;
	 boolean flag=true;
	 int i=0;
	 while(n.next!=head)
	 {
		 if(n.data==val)
		 {
			 flag=true;
			 break;
		 }
		 else
		 {
			 flag=false;
		 }
		 i++;
		 n=n.next;
	 }
	 if(flag==true)
	 {
		 System.out.println("Found at: "+i);
	 }
	 else{
		 System.out.println("Not found");
	 }
	 
 }
 public void check()
 {
	 boolean flag=true;
	// nod cnode=head;
	 if(tail.next==head)
	 {System.out.println("true");
	 }
	 else{
		 System.out.println("false");
	 }
	 
 }
 public int len()
 {
	 nod n=head;
	 int count=0;
	 if(head==null)
	 {
		 return 0;
	 }
	 else
	    { 
	        do 
	        { 
	            n = n.next; 
	            count++; 
	        } while (n != head); 
	    } 
	    return count; 
 }
 public nod delnode(nod del)
 {
	 nod temp=head;
	 if(head==del)
	 {
		 head=del.next;
		 
	 }
	// else{
		 while(temp.next!=del)
		 {
			 temp=temp.next;
		 }
		 temp.next=del.next;
		 //return head;
	 //}
	 return head;
 }
 public nod evendel()
 {
	 nod prev=head;
	 int count=1;
	
	 int l=len();
	 if(head==null)
	 {
		 System.out.println("list is empty");
		 return null;
	 }
	 nod post=prev.next;
	 while(l>0)
	 {
		 if(count%2==0)
		 {
			 prev.next = post.next; 
	            prev = post.next; 
	            post = prev.next; 
		 }
		 l--;
		 count++;
	 }
	 return head;
	 
 }
 public nod delb()
 {
	 nod tail=null;
	 nod n=head;
	 while(n.next!=head)
	 {
		 n=n.next;
	 }
	 tail=n;
	 head=head.next;
	 tail.next=head;
	 return head;
 }
 public nod dell()
 {
	 nod tail=null;
	 nod m=head;
	 while(m.next.next!=head)
	 {
		 m=m.next;
	 }
	 tail=m;
	 tail.next=head;
	 		return head;
	 
 }
	public static void main(String[] args) {
		cll list=new cll();
		list.inertbegin(13);
		list.inertbegin(54);
		list.inertbegin(65);
		list.insertend(12);
		nod m=list.insertend(31);
		System.out.println(m.data);
		//list.inertbegin(43);
		nod n=list.inertbegin(43);
		System.out.println(n.data);
		list.show();
		list.delb();
		list.show();
		list.dell();
		list.show();
		//list.search(6);
		//list.check();
		//int l=list.len();
		//System.out.println(l);
		//list.delnode(list.head);
		//list.show();
		//list.evendel();
		//list.show();

	}

}
