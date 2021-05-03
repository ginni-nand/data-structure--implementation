package ds;
import java.util.*;
public class bble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int temp=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]>a[j])
    			   
    		   {
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    	   }
       }
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println(a[i]);
       }
	}

}
