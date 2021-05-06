package ds;
class gn{
	gn next;
	int data;
}

public class intersection {
	gn head;
	public void inert(int data)
	{
		gn newnode=new gn();
		newnode.data=data;
		newnode.next=null;
		if(head==null)
		{
			head=newnode;
		}
		else{
			gn n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
			

		}
	}
	public void show()
	{
		gn snode=head;
		while(snode.next!=null)
		{
			System.out.print(snode.data+"->");
			snode=snode.next;
		}
		System.out.println(snode.data);
	}
	public int check(gn a,gn b)
	{
		gn n1=a;
		gn n2=b;
		int ans=0;
		 while (n1 != null ) { 
			 while(n2 != null)
			 {
	            if (n1.data == n2.data) { 
	                ans=n1.data; 
	            } 
	            n2 = n2.next;
			 }  
	            n1 = n1.next; 
	             
	        } 
		 return ans;
	}

	public static void main(String[] args) {
		intersection list1=new intersection();
		intersection list2=new intersection();
		list1.inert(1);
		list1.inert(2);
		list1.inert(3);
		list1.inert(4);
		list1.inert(6);
		System.out.println("list1 :");
		list1.show();
		list2.inert(5);
		list2.inert(7);
		list2.inert(4);
		list2.inert(8);
		System.out.println("liat2:");
		list2.show();
		//list1.head.next.next=list2.head.next.next;
		//gn m=null;

		System.out.println(list1.check(list1.head,list2.head));
	}

}
