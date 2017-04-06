package stack;

class stack{
	
	stack(int size){
		max=size;
		arr=new int[max];
	}
	
	int max,top=-1;
	int arr[];
	
	int peek(){
		if(top>=0){ return arr[top]; }
		System.out.println("Underflow");
		return -1;
			}
	
	int pop(){
		if(top>=0){ 
			System.out.println(arr[top]+" popped"); 
			return arr[top--]; 
			}
		else{
		System.out.println("Underflow");
		return -1;
		}
		
	}
	
	void push(int data){
		if(top+1<max) { 
			arr[++top]=data; 
			System.out.println(data+" pushed");
			 }
		else{
			System.out.println("Overflow"); 
		}
		
	}
	
	
	
	
	
	
	
}