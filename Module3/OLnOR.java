class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Parent Class for Overriding
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

// Child Class for Overriding
class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child's method - Overridden");
    }
}

public class OLnOR {
    public static void main(String[] args) {
        // 1. Demonstrate Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 nums: " + calc.add(10, 20));
        System.out.println("Sum of 3 nums: " + calc.add(10, 20, 30));

        // 2. Demonstrate Overriding
        Parent obj = new Child();
        obj.show(); // Calls the Child's version because obj is a Child
    }
}