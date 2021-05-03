package ds;
import java.util.*;
class Node3
{
  int data;
  Node3 next;
  Node3(int d)
  {
    data=d;
  }
}

public class cq {
Node3 head;
	static Node3 insertEnd(Node3 head, int data)
	  {
	    Node3 newLink = new Node3(data);
	    Node3 last = head;
	    newLink.next = null; 
	    if (head == null)  
	    {
	      head = newLink;
	      return head;
	    }
	    while (last.next != null)  
	      last = last.next;
	    last.next = newLink;  
	    return head;
	  }
	static void forwardPrint(Node3 head)
	{
	Node3 fnode=head;
	  while(fnode.next!=null)
	  {
	    System.out.print(fnode.data+"-");
	    fnode=fnode.next;
	  }
	  System.out.print(fnode.data+"-");
	}

	static void backwardPrint(Node3 head)
	{
	if (head == null) 
	  return; 
	         backwardPrint(head.next); 
	         System.out.print(head.data+"-"); 
	 
	}
	public static void main(String[] args)
	  {
	    int t,n,m;
	    cq l=new cq();
	    Scanner s = new Scanner(System.in);
	    t=Integer.parseInt(s.nextLine());
	    while(t>0)
	    {
	      Node head = null;
	      n = Integer.parseInt(s.nextLine());
	      while(n > 0)
	      {
	        m = Integer.parseInt(s.nextLine());
	        head = insertEnd(l.head, m);
	        n--;
	      }
	      //cq l=new cq();
	      forwardPrint(l.head);
	      System.out.print("\n");
	      backwardPrint(l.head);
	      System.out.print("\n");
	      t--;
	    }
	  }
}
