public class queuelist {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    node front;
    node rear;
    void enqueue(int data){
        node newnode = new node(data);
        if(front==null && rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        node temp=front;
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    void display(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queuelist ql = new queuelist();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        ql.enqueue(5);
        System.out.println("Queue after enqueue operations:");
        ql.display();
        ql.dequeue();
        System.out.println("Queue after one dequeue operation:");
        ql.display();
    }
    
}
