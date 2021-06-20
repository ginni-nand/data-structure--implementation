package ds;
import java.util.*;

public class pretoin {
	public boolean isop(char ch)
	{
		switch(ch){
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			
			
			return true;
		
		}
		return false;
	}
	public String work(String s)
	{
		Stack <String>st=new Stack<>();
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				st.push(c+" ");
			}
			else if(isop(c))
			{
				String op1=st.peek();
				st.pop();
				String op2=st.peek();
				st.pop();
				String temp="("+op1+c+op2+")";
				st.push(temp);
			}
			
			
		}
		return st.peek();
	}
	public String work2(String s)
	{
		Stack <String>st2=new Stack<>();
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				st2.push(" "+c);
			}
			else if(isop(c))
			{
				String op1=st2.peek();
				st2.pop();
				String op2=st2.peek();
				st2.pop();
				String temp="("+op2+c+op1+")";
				st2.push(temp);
			}
			
			
		}
		return st2.pop();
	}
	public String prepo(String m)
	{
		Stack<String> st3=new Stack<String>();
		
		for(int i=m.length()-1;i>=0;i--)
		{
			char c=m.charAt(i);
			
			if(isop(c))
			{
				String op1=st3.peek();
				st3.pop();
				String op2=st3.peek();
				st3.pop();
				String r=op1+op2+c;
				st3.push(r);
			}
			else
			{
				st3.push(c+"");
			}
		}
		return st3.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pretoin s=new pretoin();
        System.out.println(s.work("*-a/bc-/ade"));
        System.out.println(s.work2
        		("ab*c+"));
        System.out.println(s.prepo("-a/bc-/ak"));
	}

}
