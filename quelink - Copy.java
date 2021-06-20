package ds;
class ndo{
	ndo next;
	int data;
	
}

public class quelink {
   ndo rear,front;
   public quelink()
   {
	   rear=null;
	   front=null;
   }
   
	public void enqueue(int d)
	{
		ndo newnode=new ndo();
		newnode.data=d;
		newnode.next=null;
		if(rear==null)
		{
			front=rear=newnode;
			return;
		}
		rear.next=newnode;
		rear=newnode;
		
	}
	public ndo deque()
	{
		
		if(front.next==null)
		{
			return null;
		}
		
			ndo n=front;
			front=front.next;
			if (front == null)
			      rear = null;
		return n;
			
	}
	/*public void show()
	{
		ndo n=front;
		System.out.println("queue is:");
		while(n.next!=null)
		{
			System.out.print(n.data);
			n=n.next;
		}
	}*/

	public static void main(String[] args) {
		quelink l=new quelink();
		l.enqueue(10);
		l.enqueue(20);
		l.enqueue(30);
		l.enqueue(40);
		//l.show();
		System.out.println("front="+l.front.data);
		System.out.println("rear="+l.rear.data);
		System.out.println(l.deque().data);

	}

}
