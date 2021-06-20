package ds;

public class productofsubarr {
	static void sub(int arr[],int n)
	{
				int res = 1; 

				
				for (int i = 0; i < n; i++) { 
					int product = 1; 
					for (int j = i; j < n; j++) { 
						product = product * arr[j]; 
						res *= product; 
					} 
				} 

			
				System.out.println(res + "\n"); 
	}

	public static void main(String[] args) {
		int a[]={10,3,7};
		int n=a.length;
		sub(a,n);

	}

}
