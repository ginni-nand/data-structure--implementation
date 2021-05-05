package ds;

public class heapsort {
public static void  sort(int a[])
{
   int n=a.length;
   //bulid heap
   for(int i=n/2-1;i>=0;i--)
   {
	   heapify(a,n,i);
   }
   for(int i=n-1;i>=0;i--)
   {
	  int temp=a[0];
	  a[0]=a[i];
	  a[i]=a[0];
	   heapify(a,i,0);
   }
}
public static void heapify(int a[],int n,int i)
{
	int  large=i;
	int l=2*i+1;
	int r=2*i+2;
	if(l<n && a[l]>a[large])
	{
		large=l;
	}
	if(r<n && a[r]>a[large])
	{
		large=r;
	}
	if(large!=i)
	{
		int t=a[large];
		a[large]=a[i];
		a[i]=t;
		heapify(a,n,large);
	}
	
}
public static void printd(int a[])
{
	for(int i=0;i<a.length;++i)
	{
		System.out.print(a[i]+" ");
	}
}
public static void main(String[] args) {
		int arr[]={15,20,7,9,30};
		sort(arr);
		printd(arr);
		

	}

}
