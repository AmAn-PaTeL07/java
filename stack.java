import java.util.NoSuchElementException;

public class stack<T> {
	private static class Node<T> {
		private final T value;
		private Node<T> next;

		Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}
	}

	private Node<T> top;
	private int size;

	public void push(T value) {
		top = new Node<>(value, top);
		size++;
	}

	public T pop() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		T value = top.value;
		top = top.next;
		size--;
		return value;
	}

	public T peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		return top.value;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		return size;
	}
}
