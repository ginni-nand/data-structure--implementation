package ds;

public class mergeso {
	public static void merge(int a[],int lb,int mid,int ub)
	{
		int i=lb;
		int j=mid+1;
		int k=lb;
		int b[]=new int[a.length];
		while(i<=mid && j<=ub)
		{
			if(a[i]<=a[j])
			{
				b[k]=a[i];
				i++;
				k++;
			}
			else
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k]=a[i];
				i++;
				k++;
			}
		}
		for(k=lb;k<=ub;k++)
		{
			//System.out.println(b[k]);
			a[k]=b[k];
		}
	}
    public static void mergesort(int a[],int lb,int ub)
    {
    	if(lb<ub)
    	{
    		int mid=(lb+ub)/2;
    		mergesort(a,lb,mid);
    		mergesort(a,mid+1,ub);
    		merge(a,lb,mid,ub);
    	}
    }
	public static void main(String[] args) {
	 int a[]={12, 11, 13, 5, 6};
	 mergesort(a,0,a.length-1);
	for(int i=0;i<a.length;i++)
	{
       System.out.println(a[i]);
	 }
	}

}
