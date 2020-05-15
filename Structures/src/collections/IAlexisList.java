package collections;

import exceptions.IndexException;

public interface IAlexisList<T> {

	public boolean isEmpty();
	public void add( T elementToAdd);
	public T get(int index)throws IndexException;
	public void remove(int index)throws IndexException;
	public int size();
	
}
