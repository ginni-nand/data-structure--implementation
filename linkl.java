package ds;

public class linkl {
	Node1 start=new Node1();
	int size;
	public linkl(){
		size=0;
		start=null;
	}
	public void insertatfirst(int val)
	{
		Node1 n;
		 n=new Node1();
		 n.setData(val);
		 n.setNext(start);
		 size++;
	}
	public void insertatlast(int val)
	{
		Node1 n=new Node1();
		Node1 t;
		n.setData(val);
		t=start;
		if(t==null)
		{
			start=n;
		}
		else{
			while(t.getNext()!=null)
				t=t.getNext();
				t.setNext(n);
			
		}
		size++;
	}
	public void insertatpos(int val,int pos)
	{
		if(pos==1)
		{
			insertatfirst(val);
			
		}
		else if(pos==size+1)
		{
			insertatlast(val);
		}
		else if(pos>1 && pos<=size)
		{
			Node1 n,t;
			n=new Node1(val,null);
			t=start;
			for(int i=1;i<pos-1;i++)
				t=t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else
			System.out.println("cantttttt adddd");
	}
	public void deletefirst()
	{
		if(start==null)
		{
			System.out.println("List is empty");;
		}
		else{
			start=start.getNext();
			size--;
		}
	}
	public void deletelast()
	{
		if(start==null)
		{
			System.out.println("list is empty");
		}
		else if(size==1)
		{
			start=null;
			size--;
		}
		else{
		 Node1 t;
		 t=start;
		 for(int i=1;i<size-1;i++)
		 {
			 t=t.getNext();
		 }
		 t.setNext(null);
		}
	}
	public void deleteatpos(int pos)
	{
		if(start==null)
		{
			System.out.println("list is emptyyy");
		}
		else if(pos<1 && pos>size)
		{
			System.out.println("wrong listtt");
		}
		else if(pos==1)
		{
		 deletefirst();	
		}
		else if(pos==size)
		{
			deletelast();
		}
		else{
			Node1 t,t1;
			t=start;
			for(int i=1;i<pos-1;i++)
			{
				t=t.getNext();
			}
			t1=t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
	}
	boolean isEmpty()
	{
		if(start==null)
		{
			return (true);
		}
		else
			return(false);
	}
public int getlistsize()
{
	return (size);
}
public void show()
{
	Node1 t;
	if(isEmpty())
	{
		System.out.println("khaliiiii h reeee");
	}
	else{
		t=start;
		for(int i=1;i<=size;i++)
		{
			System.out.println(" "+t.getData());
			t=t.getNext();
		}
	}
}
}
