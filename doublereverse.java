package ds;
class dr{
	dr next;
	dr prev;
	int data;
}
public class doublereverse {
	dr head;
	public void insert(int d)
	{
		dr newnode=new dr();
		newnode.data=d;
		newnode.next=null;
		if(head==null)
		{
			head=newnode;
			newnode.prev=null;
			
		}
		else
		{
			dr n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
			newnode.prev=n;
					
		
		}
	}
	public void show()
	{
		dr snode=head;
		while(snode.next!=null)
		{
			System.out.print(snode.data+"->");
			snode=snode.next;
		}
		System.out.println(snode.data);
	}
	public void reverse()
	{
		dr current=head;
		dr temp=null;
		while(current!=null)
		{
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		if(temp.next!=null)
		{
			head=temp.prev;
		}
	}
	public void swap(int k)
	{
		
	}
	public static void main(String[] args) {
		doublereverse list=new doublereverse();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.show();
		System.out.println();
		System.out.println("**************");
		list.reverse();
		list.show();
	}

}
