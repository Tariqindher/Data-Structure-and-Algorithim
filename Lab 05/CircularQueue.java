public class CircularQueue{
	int [] array;
	int front;
	int rear;
	int size;
	int capacity;
	public CircularQueue(int capacity){
		this.capacity=capacity;
		array=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	public void enqueue(int item){
		if(isFull()){
			System.out.println("Queue is Full , can't add "+item);
			return;
		}
		if(isEmpty()){
			front=0;
		}
		rear=(rear+1)%capacity;
		array[rear]=item;
		size++;
		System.out.println("Enqueued  item  "+item);
	}
	public int dequeue(){
		if(isEmpty()){
		System.out.println("Queue is empty");
		return-1;
		}
		int item=array[front];
		if(size==front){
			front=-1;
			rear=-1;
		}
		else{
			front=(front+1)%capacity;
		}
		size--;
		System.out.println("Dequeued  :"+item);
		return item;
	}
	public boolean isFull(){
		return size==capacity;
	}

	public boolean isEmpty(){
		return size==0;
	}

	public void display(){
		if(isEmpty()){
		System.out.println("Queue is empty");
		return;
		}
		System.out.println("Queue  :");
		int count=0;
		int i=front;
		while(count<size){
		System.out.print(array[i]+"  ");
		i=(i+1)%capacity;
		count++;
		}
		System.out.println();
	}
public static void main(String args[]){

		CircularQueue obj=new CircularQueue(5);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);

		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());	
		obj.display();
		obj.dequeue();
}
}