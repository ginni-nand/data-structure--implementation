package ds;
class mg{
	mg next;
	int data;
}
public class merge {
	mg head;
	public void insert(int data)
	{
		mg newnode=new mg();
		newnode.data=data;
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			mg n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
		}
		
	}
public void show()
{
	mg snode=head;
	while(snode.next!=null)
	{
		System.out.print(snode.data+"->");
		snode=snode.next;
	}
	System.out.println(snode.data);
}
public mg mergesort(mg head1,mg head2)
{
/*	if(head1==null)
	{
		return head2;
	}
	if(head2==null)
	{
		return head1;
	}
	if(head1.data < head2.data)  
    { 
        head1.next = mergesort(head1.next, head2); 
        return head1; 
    } 
    else 
    { 
        head2.next = mergesort(head1, head2.next); 
        return head2; 
    } */
	mg dum=new mg();
	mg tail=dum;
	while(true)
	{
		if(head1==null)
		{
			tail.next=head2;
			break;
		}
		else if(head2==null)
		{
			tail.next=head1;
			break;
		}
		if(head1.data<=head2.data)
		{
			tail.next=head1;
			head1=head1.next;
		}
		else
		{
			tail.next=head2;
			head2=head2.next;
		}
		tail=tail.next;
	}
	return dum.next;
	
	
}
public void sort(mg h1)
{
	mg n=h1;
	int temp=0;
	while(n.next!=null){
		if(n.data>=n.next.data)
		{
			temp=n.data;
			n.data=n.next.data;
			n.next.data=temp;
		}
		n=n.next;
	}
}
public mg merge(mg h1,mg h2)
{
	if(h1==null)
	{
		return h2;
	}
	else if(h2==null)
	{
		return h1;
	}
	
	else
	{
		mg n=h1;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=h2;
	}
	return h1;
}
	public static void main(String[] args) {

merge list1=new merge();
merge list2=new merge();
list1.insert(10);
list1.insert(1);
list1.insert(12);
list1.insert(2);
list1.show();
System.out.println("||||||||||||||");
list1.sort(list1.head);
list1.show();
System.out.println("*****************");
list2.insert(7);
list2.insert(15);
list2.insert(17);
list2.show();
System.out.println("**************");
//list1.merge(list1.head, list2.head);
//list1.show();
//list1.mergesort(list1.head,list2.head);
//System.out.println("*****************");
//list1.show();
	}

}
