class A{
    void show(){
        System.out.println(this);
    }
}

public class thiskey {
    public static void main(String[] args){
    A r = new A();
    System.out.println(r);
    r.show();
    }
}