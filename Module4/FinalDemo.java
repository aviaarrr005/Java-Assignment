// Final Class: Cannot be extended
final class SecretClass {
    void showSecret() {
        System.out.println("This is a final class.");
    }
}

class ParentClass {
    // Final Method: Cannot be overridden in child classes
    final void display() {
        System.out.println("This is a final method.");
    }
}

public class FinalDemo extends ParentClass {
    public static void main(String[] args) {
        // Final Variable: Value cannot be changed once assigned
        final int MAX_SPEED = 120;
        System.out.println("Max Speed is: " + MAX_SPEED);
        FinalDemo demo = new FinalDemo();
        demo.display(); // Calls the inherited final method
    }
}