package ds;
import java.util.*;
public class intopost {
	public int prec(char ch)
	{
		switch(ch)
		{
		case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3;
			
		}
		return -1;
	}
	public String work(String s)
	{
		Stack <Character>st=new Stack<>();
		int l=s.length();
		String r=""; 
		for(int i=0;i<l;i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				r=r+c;
			}
			else if(c=='(')
			{
				st.push(c);
			}
			else if(c==')')
			{
				while(!st.isEmpty() && st.peek()!='(')
				{
					r=r+st.pop();
				}
				if(!st.isEmpty() && st.peek()!='(')
				{
					return "invalid";
				}
				else
					st.pop();
			}
			else
			{
				while(!st.isEmpty() && prec(c)<=prec(st.peek()))
				{
					if(st.peek()=='(')
						return "invalid";
					r=r+st.pop();
				}
				st.push(c);
				
				
			}
		}
		while (!st.isEmpty()){ 
            if(st.peek() == '(') 
                return "Invalid Expression"; 
            r += st.pop(); 
         } 
		
        return r; 
	}

	public static void main(String[] args) {
		intopost m=new intopost();
		System.out.println(m.work("(A-B)*(C/(D+E)+F)"));
		//AB- CDE +/F +* 

	}

}
