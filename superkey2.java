class Parent {
    void show(){
        System.out.println("Parent class");
    }
}
class child extends Parent
{
     void show(){
         super.show();
         System.out.println("Child class");
     }
}
public class superkey2{
    public static void main(String[] args) {
        child obj = new child();
        obj.show();

    }
}