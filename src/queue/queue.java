package queue;


public class queue {

	
	int max,rear,front;
	Object arr[];
	queue(int max){
		this.max=max;
		front=0;
		rear=-1;
		arr=new Object[max];
	}
	
	void push(Object data){
		if(rear+1<max){
			System.out.println(data.toString()+" pushed");
			arr[++rear]=data;
		}
		else{
			System.out.println("Overflow");
		}
	}
	
	Object pop(){
		if(rear==-1){
			System.out.println("Underflow");
			return null;
		}
		else if(front==rear){
			Object ob=arr[front];
			System.out.println(arr[front].toString()+" popped");
			front=0;
			rear=-1;
			return ob;
		}
		else{
			System.out.println(arr[front].toString()+" popped");
			return arr[front++];
		}
	}
	
	boolean isEmpty(){
		return (rear==-1)?true:false;
	}
	
	
	
	
	
	
}
