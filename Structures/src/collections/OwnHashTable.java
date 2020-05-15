package collections;

import java.lang.reflect.Array;

import exceptions.IndexException;

public class OwnHashTable<K,V> implements OwnMap<K,V>{
	
	//Coliciones por encadenamiento
	
	private IAlexisList<JGMap<K,V>> array[];
	private int size;
	private double factor;
	private int capacity;
	private int numberKeys;
	
	public OwnHashTable() {
		factor = 0.75; 
		capacity = 11;
		array = (AlexisSimpleLinkedList<JGMap<K,V>>[]) new Object[capacity];
		size= 0;
	}
	
//	Constructs a new, empty hashtable with a default initial capacity (11) and load factor (0.75).
	public OwnHashTable(int initialCapacity) {
		factor = 0.75; 
		capacity = initialCapacity;
		array = (AlexisSimpleLinkedList<JGMap<K,V>>[]) new Object[capacity];
		size= 0;
	}
//	Constructs a new, empty hashtable with the specified initial capacity and default load factor (0.75).

	public OwnHashTable(int initialCapacity, float loadFactor) {
		factor = loadFactor; 
		capacity = initialCapacity;
		array = (AlexisSimpleLinkedList<JGMap<K,V>>[]) new Object[capacity];
		size= 0;
	}
//	Constructs a new, empty hashtable with the specified initial capacity and the specified load factor.
	
	private Integer hash(K key) {
		//hv: hash value key
		int hv=0;
		return hv;
		
	}
	
	public void doReHash() {
		if(((int)(capacity*factor))<=(size+1))
			rehash();
	}
	
	protected void	rehash() {
		
		int newCapacity = 0 ; 
		OwnMap rehash = new OwnHashTable<>(newCapacity);
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].size() ; j++) {
				
				try {
					rehash.put(array[i].get(j).getKey(), array[i].get(j).getValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
//	Increases the capacity of and internally reorganizes this hashtable, in order to accommodate and access its entries more efficiently.
	
	@Override
	public void clear() {
		
		this.array = (AlexisSimpleLinkedList<JGMap<K,V>>[]) new Object[capacity];
	}

	@Override
	public boolean containsKey(K key) {
		int j = hash(key);
		for(int i = 0; i<array[j].size(); i++) {
			try {
				if(array[j].get(i).getKey().equals(key)) {
					return true;
				}
			} catch (IndexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean containsValue(V value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {

		try {
			V v = array[hash(key)].get(0).getValue();
			return v;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public void put(K key, V value) {

		JGMap n = new JGMap<K, V>(key, value);
		array[(int) hash(key)].add(n);
		size++;
		doReHash();
	}

	@Override
	public V remove(K key) {
		int j = hash(key);
		for(int i = 0; i<array[j].size(); i++) {
			try {
				if(array[j].get(i).getKey().equals(key)) {
					V val = array[j].get(i).getValue();
					array[j].remove(i);
					size--;
					return val;
					
				}
				
			} catch (IndexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}

	@Override
	public int size() {
		
		return size;
	}

	public IAlexisList<JGMap<K, V>>[] getArray() {
		return array;
	}

	public void setArray(IAlexisList<JGMap<K, V>>[] array) {
		this.array = array;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumberKeys() {
		return numberKeys;
	}

	public void setNumberKeys(int numberKeys) {
		this.numberKeys = numberKeys;
	}
	
	

}
