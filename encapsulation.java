public class encapsulation {

    private int a;
    private String c;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    public void setC(String c) {
        this.c = c;
    }

    public String getC() {
        return c;
    }
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setA(10);
        obj.setC("Hello, World!");
        System.out.println("String is: " + obj.getC());
    }
}
