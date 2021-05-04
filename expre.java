package ds;
import java.util.*;
public class expre {

	public static  int eval(String s)
	{
		char c[]=s.toCharArray();
		Stack <Integer> values=new Stack<Integer>();
		Stack<Character> op=new Stack<Character>();
		
		for(int i=0;i<c.length;i++)
		{
			//if(c[i]==' ')
				//continue;
			if(c[i]>='0' && c[i]<='9')
			{
				StringBuffer sbuf=new StringBuffer();
				while(i<c.length && c[i]>='0' && c[i]<='9')
					sbuf.append(c[i++]);
					values.push(Integer.parseInt((sbuf.toString())));
			}
			else if(c[i]=='(')
			{
				op.push(c[i]);
			}
			else if(c[i]==')')
			{
				while(op.peek()!='(')
				{
					values.push(applyOp(op.pop(),values.pop(),values.pop()));
					
				}
				op.pop();
			}
			else if(c[i]=='+' || c[i]=='-'|| c[i]=='/' || c[i]=='*')
			{
				while(!op.isEmpty() && hasPrecedence(c[i], op.peek()))
	                  values.push(applyOp(op.pop(), values.pop(), values.pop())); 
				  
				
				op.push(c[i]);
				
			}
		}
		while(!op.isEmpty())
		{
			values.push(applyOp(op.pop(),values.pop(),values.pop()));
		}
		return values.pop
				();
	}
	public static boolean hasPrecedence(char op1, char op2) 
    { 
        if (op2 == '(' || op2 == ')') 
            return false; 
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
            return false; 
        else
            return true; 
    } 
	public static int applyOp(char op, int b, int a) 
    { 
        switch (op) 
        { 
        case '+': 
            return a + b; 
        case '-': 
            return a - b; 
        case '*': 
            return a * b; 
        case '/': 
            if (b == 0) 
                throw new
                UnsupportedOperationException("Cannot divide by zero"); 
            return a / b; 
        } 
        return 0; 
    } 
	public static void main(String[] args) {
		
		int m=eval(" 100 * ( 2 + 12 )");
		System.out.println(m);
	}

}
