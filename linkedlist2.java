public class linkedlist2 {

    static node head;
    void insertatstart(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    void insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    