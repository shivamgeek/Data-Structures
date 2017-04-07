package stack;

public class implimentStack {

	
	public static void main(String args[]){
		
		stackInt s=new stackInt(5);
		//s.peek();
		//s.pop();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
	//	System.out.println(s.peek());
		//System.out.println(s.pop());
		//System.out.println(s.peek());
		s.pop();
		s.pop();
		s.push(55);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		
	}
	
}

