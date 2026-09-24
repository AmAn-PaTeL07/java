import java.util.*;

public class circularlinkedlist {

    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    
    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        circularlinkedlist list = new circularlinkedlist();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter data: ");
            int data = sc.nextInt();

            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                list.insertAtFirst(data);
            } 
            else if (choice == 2) {
                list.insertAtLast(data);
            } 
            else {
                System.out.println("Invalid choice!");
                i--; // don't count invalid input
            }
        }

        System.out.println("\nCircular Linked List:");
        list.display();

        sc.close();
    }
}