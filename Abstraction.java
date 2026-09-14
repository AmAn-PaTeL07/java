public class Abstraction extends  AbstractClass {
    void display() {
        System.out.println("I love Dogs");
    }
            public static void main(String[] args) {
            Abstraction obj = new Abstraction();
            Abstraction dog = new Abstraction();
            obj.display();
            dog.sound();
            dog.eat();
        }
    }


