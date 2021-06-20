package ds;

public class subcount {

	public static void main(String[] args) {
		int a[]={2,3,4,3,6};
		int sum=6;
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			int sum1=0;
			for(int j=i;j<n;j++)
			{
				
				
					sum1=a[i]+a[j];
				if(sum1==sum)
				{
					System.out.println("["+a[i]+" and "+a[j]+"]");
					
					count++;
				}
				if(a[i]==sum)
				{
					System.out.println("["+a[i]+"]");
					count++;
					break;
					
				}
			}
		}
		System.out.println(count);

	}

}
