public class circularqueue {
    int front, rear, size,count;
    int [] queue;
    circularqueue(int size){
        front=0;
        rear=0;
        size=size;
        count=0;
        queue=new int[size];
    }
    void enqueue(int data){
        if(count==queue.length){
            System.out.println("Queue is full");
            return;
        }
        queue[rear]=data;
        rear=(rear+1)%queue.length;
        count++;
    }
    void dequeue(){
        if(count==0){
            System.out.println("Queue is empty");
            return;
        }
        front=(front+1)%queue.length;
        count--;
    }
    void display(){
        if(count==0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<count;i++){
            System.out.print(queue[(front+i)%queue.length]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        circularqueue cq = new circularqueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println("Queue after enqueue operations:");
        cq.display();
        cq.dequeue();
        System.out.println("Queue after one dequeue operation:");
        cq.display();
    }

}