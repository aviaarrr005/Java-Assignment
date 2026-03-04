class A {}
class B {}

public class dd {

    public static void main(String[] args) {

        final A obj1 = new A();
        final B obj2 = new B();

        Thread t1 = new Thread(() -> {
            synchronized(obj1) {
                System.out.println("Thread 1 locked A");
                try { Thread.sleep(100); } catch(Exception e){}
                synchronized(obj2) {
                    System.out.println("Thread 1 locked B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(obj2) {
                System.out.println("Thread 2 locked B");
                try { Thread.sleep(100); } catch(Exception e){}
                synchronized(obj1) {
                    System.out.println("Thread 2 locked A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}