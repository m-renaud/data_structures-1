
public class Node<T> {
	
	private T value;
	private Node next;
	private Node prev;
	
	public Node(){
		value = null;
		next = null;
	}
	
	public Node(T v){
		value = v;
		next = null;
	}
	
	public Node(T t, Node n){
		value = t;
		next = n;
	}
	
	public T value(){
		return value;
	}
	
	public void setValue(T v){
		value = v;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public void setPrev(Node n){
		prev = n;
	}
	
	public Node next(){
		return next;
	}
	
	public Node prev(){
		return prev;
	}
}
