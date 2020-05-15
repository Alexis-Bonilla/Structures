package collections;

import exceptions.EmptyStackException;

public interface IAlexisStack<T> {

	public void push(T newElement);
	
	public T pop();
	
	public boolean isEmpty();
	
	public T top();
	
	public int size();
	
	
	
	
	
}
