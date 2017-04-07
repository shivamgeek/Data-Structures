package queue;

public class queueInt {
	
	public static void main(String args[]){
		
		queueInt q=new queueInt(5);
		q.pop();
		q.push(1);
		q.push(2);
		
		q.pop();
		q.pop();
		q.pop();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.push(6);
		
		
	}
	
	
	
	
	
	
	
	

	queueInt(int size){
		max=size;
		arr=new int[max];
	}
	
	int max,arr[];
	int front=0,rear=-1;
	
	void push(int data){
		if(rear+1<max){
			arr[++rear]=data;
			System.out.println(data+ " pushed");
		}else{
			System.out.println("Overflow");
		}
		
	}
	
	
	int pop(){
		if(rear==-1){
			System.out.println("Underflow");
			return -1;
		}
		else if(front==rear){
			int data=arr[front];
			System.out.println(data+" popped");
			front=0;
			rear=-1;
			return data;
		}
		System.out.println(arr[front]+" popped");
		return arr[front++];
		
	}
	
	boolean isEmpty(){
		if(rear==-1){
			return true;
		}return false;
	}
	
	
	
	
	
	
}
