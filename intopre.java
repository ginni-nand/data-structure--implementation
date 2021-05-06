package ds;
import java.util.*;
public class intopre {
	public boolean isop(char ch)
	{
		switch(ch)
		{
		case '^':
		case '*':
		case  '+':
		case '/':
		case '-':
			return true;
		}
		return false;		
	}
	public int prec(char C)
	{
		if (C== '-' || C == '+') 
	        return 1; 
	    else if (C == '*' || C == '/') 
	        return 2; 
	    else if (C == '^') 
	        return 3; 
	    return 0; 
	}
 public String workdo(String infix)
 {
	 Stack<Character> operators = new Stack<Character>(); 

		// stack for operands. 
		Stack<String> operands = new Stack<String>(); 

		for (int i = 0; i < infix.length(); i++) 
		{ 

			// If current character is an 
			// opening bracket, then 
			// push into the operators stack. 
			if (infix.charAt(i) == '(') 
			{ 
				operators.push(infix.charAt(i)); 
			} 

			 
			else if (infix.charAt(i) == ')') 
			{ 
				while (!operators.empty() && 
					operators.peek() != '(') 
					{ 

					// operand 1 
					String op1 = operands.peek(); 
					operands.pop(); 

					// operand 2 
					String op2 = operands.peek(); 
					operands.pop(); 

					// operator 
					char op = operators.peek(); 
					operators.pop(); 

					
					String tmp =op2 + op1+op; 
					operands.push(tmp); 
				}
				operators.pop(); 
			} 
			else if (!isop(infix.charAt(i))) 
			{ 
				operands.push(infix.charAt(i) + ""); 
			} 
			else
			{ 
				while (!operators.empty() && 
				prec(infix.charAt(i)) <= 
						prec(operators.peek())) 
					{ 

					String op1 = operands.peek(); 
					operands.pop(); 

					String op2 = operands.peek(); 
					operands.pop(); 

					char op = operators.peek(); 
					operators.pop(); 

					String tmp =op2 + op1+op; 
					operands.push(tmp); 
				} 

				operators.push(infix.charAt(i)); 
			} 
		} 

		
		while (!operators.empty()) 
		{ 
			String op1 = operands.peek(); 
			operands.pop(); 

			String op2 = operands.peek(); 
			operands.pop(); 

			char op = operators.peek(); 
			operators.pop(); 

			String tmp = op2 + op1+op; 
			operands.push(tmp); 
		} 
		return operands.peek();
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intopre l=new intopre();
		System.out.println(l.workdo("(10*4)+2"));
//*-A/BC-/AKL
	}

}
