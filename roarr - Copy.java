package ds;

public class roarr {
	 void leftrotate(int arr[],int d,int n)
	{
		for(int i=0;i<d;i++)
		{
			rotone(arr,n);
		}
	}
	 void rotone(int ar[],int n)
	 {
		 int temp=ar[n-1];
		 int i;
		 for(i=n-1;i>0;i--)
		 {
			 ar[i]=ar[i-1];
		 }
		 ar[0]=temp;
	 }
	

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		roarr r=new roarr();
		r.leftrotate(a,2,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
