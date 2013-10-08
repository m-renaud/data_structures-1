
public class LinkedList<T> {
	
	private Node head; //represents the head of the List
	private Node tail; //Represents the tail of the List
	private String type; //Represents the type of the List (Singly or Doubly)
	
	public LinkedList(){
		type = "Doubly";
		head = null;
		tail = null;
	}
	
	public LinkedList(String s){
		if(s == "Doubly" || s == "Singly")
			type = s;
		head = null;
		tail = null;
	}
	
	//Adds a Node to the end of the linked list
	public void add(T n){
		if(type == "Doubly"){
			if(head == null){
				head = new Node(n);
				tail = head;
			}
			
			Node nw = new Node(n);
			tail.setNext(nw);
			nw.setPrev(tail);
			tail = nw;
		}
		
		else if(type == "Singly"){
			if(head == null){
				head = new Node(n);
				tail = head;
			}
			
			Node nw = new Node(n);
			tail.setNext(nw);
			tail = nw;
		}
	}
	
	//Removes the head from the linked list
	public void remove(){
		Node nw = head.next();
		head.setNext(null);
		nw.setPrev(null);
		head = nw;
	}
	
	public void remove(int i){
		Node tmp = head;
		for(int j=0; j<i; j++){
			tmp = tmp.next();
		}
		
		if(type == "Doubly"){
			Node prev = tmp.prev();
			Node next = tmp.next();
			prev.setNext(next);
			next.setPrev(prev);
		}
		else if(type == "Singly"){
			T v = (T)tmp.next().value();
			tmp.setValue(v);
			tmp.setNext(tmp.next().next());
		}
	}
	
	//Returns the value at the head Node
	public T peek(){
		return (T) head.value();
	}
	
	//Returns the value at the tail Node
	public T peekTail(){
		return (T) tail.value();
	}
	
	//Returns the size of the Linked List
	public int size(){
		Node tmp = head;
		int i=0;
		while(tmp !=null){
			tmp = tmp.next();
			i++;
		}
		
		return i;
	}
	
	//Replaces the Node at index i with the Node n
	public void set(Node n, int i){
		Node tmp = head;
		for(int j=0; j<i; j++){
			tmp = tmp.next();
		}
		
		n.setNext(tmp.next());
		n.setPrev(tmp.prev());
		tmp.setNext(null);
		tmp.setPrev(null);
		
	}
	
	//Returns the Head Node
	public Node head(){
		return head;
	}
	
	//Returns the Tail Node
	public Node tail(){
		return tail;
	}
	
	//Returns the Linked List type (Single or Doubly) 
	public String getType(){
		return type;
	}
}
