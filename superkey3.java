class Parent {
        Parent(){
        System.out.println("Parent class");
    }
}
class child extends Parent
{
         child(){
         super();
         System.out.println("Child class");
     }
}
public class superkey3{
    public static void main(String[] args) {
        new child();

    }
}