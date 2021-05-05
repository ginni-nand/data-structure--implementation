package ds;
 class heap {
  private int cap;
  private int size;
  private int arr[];
   heap(int c){
	  c=cap;
	  size=1;
	  arr=new int[cap];
	  
  }
   private static int parent(int pos)
   {
	   return (pos-1)/2;
   }
   private static int left(int pos)
   {
	   return 2*pos+1;
   }
   private static int right(int pos)
   {
	   return 2*pos+2;
   }
   private void swap(int i,int j)
   {
	   int temp=arr[i];
	   arr[i]=arr[j];
	   arr[j]=temp;
   }
   private void insert(int d)
   {
	   if(size>=cap)
		   return;
	   arr[++size]=d;
	   int current=size;
	   while(arr[current]<arr[parent(current)])
	   {
		   swap(current,parent(current));
		   current=parent(current);
	   }
   }
   public  void minheap()
   {
	   for(int pos=size/2;pos>=1;pos--)
	   {
		   heapify(pos);
	   }
   }
   public  boolean isleaf(int pos)
   {
	   if(pos>=size/2 && pos<=size)
	   {
		   return true;
	   }
	   return false;
   }
   public  void heapify(int pos)
   {
	   if(!isleaf(pos))
	   {
		  if(arr[pos]>arr[left(pos)] || arr[pos]>arr[right(pos)])
		  {
			  if(arr[pos]>arr[left(pos)])
			  {
				  swap(pos,left(pos));
				  heapify(left(pos));
			  }
			  else
			  {
				  swap(pos,right(pos));
				  heapify(right(pos));
			  }
		  }
			  
	   }
   }
   public  void print()
   {
	   for (int i = 1; i <= size / 2; i++) { 
           System.out.print(" PARENT : " + arr[i] 
                            + " LEFT CHILD : " + arr[2 * i] 
                            + " RIGHT CHILD :" + arr[2 * i + 1]); 
           System.out.println(); 
       } 
   }
	public static void main(String[] args) {
		heap h=new heap(15);
		System.out.println("hvsfev");
		h.insert(5);
		h.insert(3);
		h.insert(17);
		h.insert(10);
		h.insert(84);
		h.insert(19);
		h.insert(6);
		h.insert(22);
		h.insert(9);
		h.print();
		h.minheap();
		h.print();
		

	}

}
