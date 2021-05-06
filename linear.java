package ds;
import java.util.*;

public class linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]={1,2,3,6,4};
int s=sc.nextInt();
int f=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]==s)
	{
		f=i;
	}
}
if(f==0)
{
	System.out.println("Not found");
}
else
System.out.println("answer is "+f);

	}

}
