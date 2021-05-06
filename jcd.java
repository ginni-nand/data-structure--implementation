package ds;

public class jcd {

	public static void main(String[] args) {
		int arr[] = {11, 15, 6, 7, 9, 10}; 
        int sum = 16; 
        int count=0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i]+arr[j]==sum)
        		{
        			count++;
        		}
        	}
        }
        System.out.println(count);

	}

}
