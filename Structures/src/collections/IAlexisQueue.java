package collections;

import exceptions.EmptyQueueException;

public interface IAlexisQueue<T> {

	public void enQueue(T newElement);
	
	public boolean isEmpty();
	
	public T front();
	
	public T deQueue();
	
	public int size();
}
