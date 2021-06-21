package ds;

public class work {

	public static void main(String[] args) {
		llink2l list=new llink2l();
		System.out.println("before insert: ");
		list.insert(11);
		list.insert(45);
		list.insert(33);
		list.insert(23);
		list.insert(40);
		list.show();
		int index=list.search(23);
		int del=list.search(40);
		
		System.out.println("index of 23 is "+ index);
		list.insertafter(index, 55);
		System.out.println("after insertion: ");
		list.show();
		
		
		
	}

}
