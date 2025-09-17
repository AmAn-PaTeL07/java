class Parent {
    int num = 10;
}
class child extends Parent{
    int num = 20;
    void display(){
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
    }
}
public class superkey{
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
    }
}
