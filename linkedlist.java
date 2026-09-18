public class linkedlist {
   static class node {
      int data;
      node next;

      node(int data) {
         this.data = data;
      }
   }

   node head;

   public linkedlist() {
   }

   void insert(int var1) {
      node var2 = new node(var1);
      if (this.head == null) {
         this.head = var2;
      } else {
         node var3;
         for(var3 = this.head; var3.next != null; var3 = var3.next) {
         }

         var3.next = var2;
      }

   }

   void display() {
      if (this.head == null) {
         System.out.println("List is empty");
      } else {
         node var1 = this.head;
         System.out.print("Linked List: ");

         while(var1 != null) {
            System.out.print(var1.data + "->");
            var1 = var1.next;
         }

         System.out.println("null");
      }

   }

   public static void main(String[] var0) {
      linkedlist var1 = new linkedlist();
      var1.insert(10);
      var1.display();
      var1.insert(20);
      var1.display();
      var1.insert(30);
      var1.display();
   }
}