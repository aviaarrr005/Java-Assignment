//Create an abstract class Shape with an abstract method area(). Implement it in Circle
//and Rectangle classes.

abstract class Shape{
    abstract void shape();
}

class Circle extends Shape{
    @Override
    void shape() {
        System.out.println("This is a Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void shape() {
        System.out.println("This is a Rectangle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.shape();
        s2.shape();
    }
}