package ds;
class Nd{
	Nd next;
	int data;
}

public class unsorted {
 Nd head;
	public void insert(int val)
	{
		Nd newnode=new Nd();
		newnode.data=val;
		newnode.next=null;
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Nd n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
			
		}
	}
	public void show()
	{
		Nd snode=head;
		while(snode.next!=null)
		{
			System.out.print(snode.data+"->");
			snode=snode.next;
		}
		System.out.println(snode.data);
	}
	public void deldupli()
	{
		Nd ptr1=null;
		Nd ptr2=null;
		Nd dup=null;
		ptr1=head;
		while(ptr1!=null && ptr1.next!=null)
		{
			ptr2=ptr1;
			while(ptr2.next!=null)
			{
				if(ptr1.data==ptr2.next.data)
				{
					dup=ptr2.next;
					ptr2.next=ptr2.next.next;
					
				}
				else
				{
					ptr2=ptr2.next;
				}
			}
			ptr1=ptr1.next;
		}
	}
	public static void main(String[] args) {
		unsorted list=new unsorted();
		list.insert(23);
		list.insert(12);
		list.insert(43);
		list.insert(12);
		list.insert(11);
		list.insert(12);
		list.insert(11);
		list.show();
		list.deldupli();
		list.show();

	}

}
