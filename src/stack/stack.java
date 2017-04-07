package stack;

public class stack {

	
	int top,max;
	Object arr[];
	
	stack(int max){
		this.max=max;
		top=-1;
		arr=new Object[max];
	}
	
	Object pop(){
		if(top>=0){
			System.out.println(arr[top].toString()+" popped");
			return arr[top--];
		}else{
			System.out.println("Underflow");
			return null;
		}
	}
	
	void push(Object data){
		if(top+1<max){
			arr[++top]=data;
			System.out.println(data.toString()+" pushed");
		}
		else{
			System.out.println("Overflow");
		}
	}
	
	
	boolean isEmpty(){
		return (top==-1)?true:false;
	}
	
	
	
	
	
	
	
	
}
