package ds;
import java.util.*;

public class expressiontree {
 static class node{
	 char d;
	 node right,left;
	 node(char ds)
	 {
		 d=ds;
	 }
 }
 public static void inorder(node temp)
 {
	 if(temp==null)
		 return;
	 //inorder(temp.left);
	 
	 System.out.print(temp.d+" ");
	 inorder(temp.left);
	 inorder(temp.right);
 }
 static boolean isOperator(char c) { 
     if (c == '+' || c == '-'
             || c == '*' || c == '/'
             || c == '^') { 
         return true; 
     } 
     return false; 
 } 
 public static node express(char p[])
 {
	 Stack<node> st=new Stack<>(); 
	 node t,t1,t2;
	 for(int i=0;i<p.length;i++)
	 {
		 if(!isOperator(p[i]))
		 {
			 t=new node(p[i]);
			 st.push(t);;
		 }
		 else
		 {
			 t=new node(p[i]);
			 t1=st.pop();
			 t2=st.pop();
			 t.right=t1;
			 t.left=t2;
			 st.push(t);
			 
		 }
		 
	 }
	 t=st.peek();
	 st.pop();
	 return t;
}
	public static void main(String[] args) {
		String post="ab+ef*g*-";
		char ch[]=post.toCharArray();
		node root=express(ch);
		System.out.println("inorder post:");
		inorder(root);
	}

}
