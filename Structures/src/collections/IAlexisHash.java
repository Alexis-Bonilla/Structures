package collections;

public interface IAlexisHash<T> {
	public int length();
	public boolean isEmpty();
	public void insert(Node<T> newNode);
	public void delete(int key);
	public Node<T> retrieve();
	public int hashFunction(int key);
}
