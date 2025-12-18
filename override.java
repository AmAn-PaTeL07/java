public class override {
    static class Parent {
        void show() {
            System.out.println("Parent class show method");
        }
    }

    static class Child extends Parent {
        //@Override
        void show() {
            super.show();
            System.out.println("Child class show method");
        }
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
