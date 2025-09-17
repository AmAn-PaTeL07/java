class Animal{
    void sound()
    {
        System.out.println("Animal make sounds");
     }
}
class dog extends Animal
{ 
    void sound()
    {
        System.out.println("Dog barks");
     }
}

public class methodoverd{
    public static void main(String[] arr)
    {
         dog a = new dog();
         a.sound();
         Animal b =new Animal();
         b.sound();
    }
}