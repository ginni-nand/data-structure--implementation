package ds;

public class mergesort {
	public void merge(int a[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int al[]=new int[n1];
		int ar[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			al[i]=a[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			ar[j]=a[m+l+1];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(al[i]<=ar[j])
			{
				a[k]=al[i];
				i++;
			}
			else
			{
			 a[k]=ar[j];
			 j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=al[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=ar[j];
			j++;
			k++;
		}
		
	}
	public void sort(int a[],int l,int r)
	{
		if(l<r)
		{
			int mid=(r+l)/2;
			sort(a,l,mid);
			sort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={12,11,13,5,6,7};
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+"->");
}
mergesort obj=new mergesort();
obj.sort(a,0,a.length-1);
System.out.println("after sort:");
for(int m=0;m<a.length;m++)
{
	System.out.print(a[m]+"->");
}
	}

}
