package collections;

public class Node<T> {
	private T element;
	private Node<T> nextNode;
	
	public Node(T newNode) {
		element= newNode;
		
	}

	public void push(T newElement) {
		Node newNode= new Node(newElement);
		newNode.setNextNode(this);
		
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
	
	
	
	

}
