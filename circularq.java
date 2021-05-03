package ds;

public class circularq {
	static int front=-1;
	static int rear=-1;
	static int size=5;
	static int queue[]=new int[size];
	public static void enqueue(int x)
	{
		if((rear+1)%size==front)
		{
			System.out.println("queue is full");
		}
		else if(rear==-1 && front==-1){
			front=0;
			rear=0;
			queue[front]=x;
			
		}
		else if(rear==size-1 && front!=0)
		{
			rear=0;
			queue[rear]=x;
		}
		else
		{
			rear++;
			queue[rear]=x;
		}
	}
  public static int dequeue()
  {
	  int m=0;
	  if(front==-1 && rear==-1)
	  {
		  System.out.println("queue is empty");
		  m=0;
	  }
	  else if(front==rear)
	  {
		  m=queue[front];
		  front=-1;
		  rear=-1; 
	  }
	  else
	  {
		  m=queue[front];
		  front=(front+1)%size;
	  }
	  return m;
  }
	public static void main(String[] args) {
		/*enqueue(10);
		enqueue(2);
		enqueue(12);
		enqueue(17);
		enqueue(4);
		enqueue(3);
		System.out.println("queue is:");
		int i=front;
		while(i!=rear)
		{
		System.out.print(queue[i]+",");
		i=(i+1)%size;
		}
		System.out.println(queue[rear]);
		System.out.println("niklne vala element is:"+dequeue());
		//System.out.println("niklne vala element is:"+dequeue());
		//System.out.println("niklne vala element is:"+dequeue());
		enqueue(31);
		int j=front;
		System.out.println("dekho to");
		while(j!=rear)
		{
		System.out.print(queue[j]+",");
		j=(j+1)%size;
		}
		System.out.println(queue[rear]);
		
		*/
		 System.out.println("Front = "+front+ ", Rear = "+rear);
		    enqueue(10);
		    System.out.println("Front = "+front+ ", Rear = "+rear);
		    enqueue(20);
		    System.out.println("Front = "+front+ ", Rear = "+rear);
		    enqueue(30);
		    System.out.println("Front = "+front+ ", Rear = "+rear);
		    enqueue(40);
		    System.out.println("Front = "+front+ ", Rear = "+rear);

		    dequeue();
		    System.out.println("Front = "+front+ ", Rear = "+rear);
		    dequeue();
		    System.out.println("Front = "+front+ ", Rear = "+rear);
		    dequeue();
		    System.out.println("Front = "+front+ ", Rear = "+rear);
		    dequeue();
		    System.out.println("Front = "+front+ ", Rear = "+rear);
		    dequeue();
		    System.out.println("Front = "+front+ ", Rear = "+rear);

		    enqueue(50);
		    System.out.println("Front = "+front+ ", Rear = "+rear);
	}

}
