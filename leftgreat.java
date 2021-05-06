package ds;
import java.util.*;
public class leftgreat {
	static int MAX=3000;
	public static int[] lef (int a[],int n)
	{
		int []left_index = new int[MAX]; 
        Stack<Integer> s = new Stack<Integer>(); 
      
        for (int i = n - 1; i >= 0; i--) 
        { 
      
            // checking if current  
            // element is greater than top 
            while (s.size() != 0 &&  
                     a[i] > a[s.peek() - 1]) 
            { 
                int r = s.peek(); 
                s.pop(); 
      
                // on index of top store  
                // the current element  
                // index which is just  
                // greater than top element 
                left_index[r - 1] = i + 1; 
            } 
      
            // else push the current 
            // element in stack 
            s.push(i + 1); 
        }
        return left_index;
	}

	public static void main(String[] args)
	{
		 int []arr = new int[]{ 5, 4, 3, 4, 5 }; 
	        int n = arr.length;
	        System.out.println(lef(arr,n));
	}

}
