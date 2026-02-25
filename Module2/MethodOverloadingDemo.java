public class MethodOverloadingDemo {
    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo math = new MethodOverloadingDemo();
        System.out.println(math.add(10, 20));       
        System.out.println(math.add(10, 20, 30));   
        System.out.println(math.add(5.5, 2.5));     
    }
}