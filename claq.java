package ds;
class emp{
	String name,department;
	int age,id;
	emp(String name,int age,int id,String department)
	{
		this.name=name;
		this.age=age;
		 this.id = id;
	        this.department = department;
	}
	 public String toString(){
	        return this.id + " ";
	    }
}

public class claq {
	 int top;
	    int capacity;
	    emp[] stack;
	    
	    claq(){
	        top = -1;
	        capacity = 10;
	         stack= new emp[capacity];
	    }
	    public void push(emp data){
	        if(size() == capacity){
	            System.out.println("stack is full");
	            return;
	        } 
	        top = top + 1;
	        stack[top] = data;
	    }
	    public int size(){
	        return top + 1;
	    }
	    public boolean isEmpty(){
	        return top < 0;
	    }
	    
	    public emp pop(){
	        if(size() == 0){
	            System.out.println("stack is empty");
	            // return ;
	        }
	        emp element = stack[top];
	        top = top - 1;
	        return element;
	    }
	public static void main(String[] args) {
		
		emp john = new emp("john",20,1,"cse");
		emp mary = new emp("mary",21,2,"cse");
		emp bob = new emp("bob",22,3,"cse");
		claq s = new claq();
		s.push(mary);
		s.push(john);
		//s.push(mary);
		s.push(bob);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
