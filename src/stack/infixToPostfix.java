package stack;

public class infixToPostfix {
	
	public static void main(String args[]){
		
		String infix="a+b*(c^d-e)^(f+g*h)-i",postfix="";
		stack1 s=new stack1(20);
		for(int i=0;i<infix.length();i++){
			
			char val=infix.charAt(i);
			if(isOperand(val)){
				postfix+=val;
			}
			else if(precedence(s.peek())<precedence(val) || val=='('){
				s.push(val);
			}
			else if(val==')'){
				while(!s.isEmpty() && s.peek()!='('){
				postfix+=s.pop();
			}
				if(!s.isEmpty() && s.peek()=='('){
				s.pop();
				}else{
					System.out.println("error in expression");
					return;
				}
			}
			else{
				while(!s.isEmpty() &&  precedence(s.peek())>=precedence(val)){
					postfix+=s.pop();
				}
				s.push(val);
				
				
				
				
				
			}
		
		}

		while(!s.isEmpty()){
			postfix+=s.pop();
		}
		
		
		
		System.out.println(postfix+ " expression");
		
	}
	
	static boolean isOperand(char data){
		if((data>='a' && data<='z') || (data>='A' && data<='Z')){
			return true;
		}
		return false;
	}
	
	
	static int precedence(char op){
		
		switch(op){
		case '+':
		case '-':{ return 1; }
		case '*':
		case '/': { return 2; }
		case '^': { return 3; }
		}
		return -1;
		
	}
	
	
	
	
}

class stack1{
	
	char arr[];
	int max,top;
	
	stack1(int size){
		max=size;
		arr=new char[max];
	}
	
	char pop(){
		if(top>=0){
			System.out.println(arr[top]+" popped");
			return arr[top--];
		}
		System.out.println("Underflow");
		return '0';
	}
	
	void push(char data){
		if(top+1<max){
			arr[++top]=data;
			System.out.println(data+" pushed");
			return;
		}
		System.out.println("Overflow");
	}
	
	
	char peek(){
		if(top>=0){
			return arr[top];
		}
		System.out.println("Underflow");
		return '0';
	}
	
	boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	
	
	
	
}












