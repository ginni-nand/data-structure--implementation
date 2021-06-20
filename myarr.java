package ds;
import java.util.*;
public class myarr {
	
	static public void rotate(int a[],int d,int n)
	{
		for(int i=0;i<d;i++)
		{
			rotateone(a,n);
		}
	}
	public static void rotateone(int a[],int n)
	{
		int temp=a[n-1];
		int i;
		a[0]=temp;
		for(i=1;i<n-1;i++)
		{
			a[i+1]=a[i];
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] = {1, 2, 3, 4, 5,  
                6, 7, 8, 9, 10};
		int n=a.length;
		
		rotate(a,2,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
