package collections;

import exceptions.IndexException;

public class JGArrayList <T>implements JGList{
	
	private T[] array;
	private int size;

	public JGArrayList() {

		size = 0;
	}
	@Override
	public boolean isEmpty() {
		
		return (size == 0);
	}

	@Override
	public void add(Object item) {
		if(size == array.length)
			reArray();
		
		array[size] = (T)item;
		size++;
	}

	@Override
	public void add(int index, Object item) throws IndexException {
		
		if(size == array.length)
			reArray();
		int i = index;
		if(index >= size) {
			add(item);
		}
		else {

			T actual = array[i];
			T aux;
			array[i] = (T) item;
			for(int j=i; j<size; j++) {
				aux= array[j+1];
				array[j+1] = actual;
				actual = aux;
			}
			size++;
		}
		
		
	}

	@Override
	public Object get(int index) throws IndexException {

		return array[index];
		
	}

	@Override
	public void remove(int index) throws IndexException {
		if(index >= size)
			throw new IndexException(null);
		int j = index;
		T actual = array[size-1];
		T aux;
		for ( int i = size-1; i>j; i--) {
			aux= array[i-1];
			array[i-1] = actual;
			actual = aux;
		}
		size--;
	}

	@Override
	public int size() {
		
		return size;
	}
	
	public void reArray() {
		
		array = enlarge();
	}

	private T[] enlarge() {
		
		T[] a =  (T[]) new Object[size+10];
		
		for(int i=0; i<size ; i++) {
			a[i]= array[i];
		}
		return a;
	}
}
