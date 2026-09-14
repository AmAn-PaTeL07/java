public class polymorphisam {
    public void area(int a) {
        System.out.println("Area of Square: " + (a * a));
    }

    public void area(int l, int b) {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    public void area(double r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        polymorphisam obj = new polymorphisam();
        obj.area(5);
        obj.area(4, 6);
        obj.area(3.5);
    }
    
}
