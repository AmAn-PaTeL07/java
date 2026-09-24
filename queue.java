import java.util.*;
public class queue {
    private List<Object> items;

    public queue() {
        items = new ArrayList<>();
    }

    public void enqueue(Object item) {
        items.add(item);
    }

    public void display() {
        System.out.println("Queue items: " + items);
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return items.remove(0);
    }

    public Object front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return items.get(0);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(40);
        q.enqueue(350);
        q.enqueue(652);
        q.enqueue(568);
        q.display();
        System.out.println("Front item: " + q.front()); 
        System.out.println("Queue size: " + q.size()); 
        System.out.println("Dequeue item: " + q.dequeue());
        System.out.println("Queue size after dequeue: " + q.size()); 
    }
}
