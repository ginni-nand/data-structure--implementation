package ds;
import java.util.*;
public class prepro {
	public boolean isop(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			return true;
		}
		return false;
	}
	public String wo(String s)
	{
		Stack<String> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(isop(c))
			{
				String op1=st.peek();
				st.pop();
				String op2=st.peek();
				st.pop();
				String temp =c+op2+op1;
				st.push(temp);
			}
			else
				st.push(c+" ");
		}
		return st.peek();
	}

	public static void main(String[] args) {
		prepro l=new prepro();
		System.out.println(l.wo("ABC/-AK/L-*"));
		//ABC/-AK/L-*
//*-A/BC-/AKL
	}

}
