package collections;

import exceptions.EmptyStackException;
import exceptions.IndexException;

public class AlexisSimpleLinkedList<T> implements IAlexisStack<T>,IAlexisQueue<T>,IAlexisList<T> {

	private Node<T> firstElement;
	private Node<T> lastElement;
	private int size;
	
	public AlexisSimpleLinkedList(){
		firstElement=null;
		lastElement=null;
		size=0;
	}
	
	
	
	
	
	
	@Override
	public void push(T newElement) {
		Node newNode= new Node(newElement);
		newNode.setNextNode(firstElement);
		firstElement=newNode;
		size++;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return null;
		}else {
			Node<T> aux= firstElement;
			firstElement=firstElement.getNextNode();
			size--;
			return aux.getElement();
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return firstElement==null;
	}

	@Override
	public T top(){
		// TODO Auto-generated method stub
		if(isEmpty()) 
			return null;

		return firstElement.getElement();
	}

	@Override
	public void enQueue(T newElement) {
		Node<T> newE = new Node(newElement);
		if(firstElement==null) {
			firstElement=newE;
			lastElement=newE;
			size++;
		}
		else {
			lastElement.setNextNode(newE);
			lastElement=newE;
			size++;
		}
	}

	@Override
	public T front()  {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return null;
		}
		return firstElement.getElement();
	}

	@Override
	public T deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		Node<T> returnNode= firstElement;
		firstElement=firstElement.getNextNode();
		size--;
		return returnNode.getElement();
	}

	@Override
	public void add(T elementToAdd) {
		// TODO Auto-generated method stub
		Node<T> newNode= new Node<T>(elementToAdd);
		if(firstElement==null) {
			firstElement=newNode;
			lastElement=newNode;
			size++;
		}
		else {
			lastElement.setNextNode(newNode);
			lastElement=newNode;
			size++;
		}
		
	}

	@Override
	public T get(int index) throws IndexException {
		// TODO Auto-generated method stub
		if(index<0)
			throw new IndexException("Please, enter a correct number");
		Node<T> actual =firstElement;
		for (int i = 0; i < index; i++) {
			actual=actual.getNextNode();
		}
		return actual.getElement();
	}

	@Override
	public void remove(int index) throws IndexException {
		// TODO Auto-generated method stub
		if(index<0||index>size-1)
			throw new IndexException("Please, enter a correct number");
		Node<T> actual =firstElement;
		if(index==0) {
			firstElement=firstElement.getNextNode();
			size--;
		}
		else {
			for (int i = 0; i < index-2; i++) {
				actual=actual.getNextNode();
			}
			actual.setNextNode(actual.getNextNode().getNextNode());
			size--;
		}
		
	}

	@Override
	public int size() {
		return size;
	}

}
