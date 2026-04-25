package day18;

public class TypeCastingObjects1 {

    static class Parent {
        void m1() {
            System.out.println("this is m1 from parent..");
        }
    }

    static class Child extends Parent {
        void m2() {
            System.out.println("this is m2 from child");
        }
    }

    public static void main(String[] args) {

        Child c = new Child();
        

        c.m1(); // Parent method
        c.m2(); // Child method
    }
}
