package collections;

import exceptions.IndexException;

public interface JGList <T>{
	
	public boolean isEmpty();
	public void add( T item);
	public void add(int index, T item)throws IndexException;
	public T get(int index)throws IndexException;
	public void remove(int index)throws IndexException;
	public int size();
	
}
