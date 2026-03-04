//Create a thread using Thread class and another using Runnable interface. Compare
//both approaches.
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class threed {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);         // We need to create a Thread object and pass the Runnable instance to it
        t2.start();

    }
}


//Comparision b/w thread and Runnable:
//1. Thread class: We can create a thread by extending the Thread class. However, since Java does not support multiple inheritance, if we extend Thread, we cannot extend any other class.
//2. Runnable interface: We can create a thread by implementing the Runnable interface. This allows us to implement multiple interfaces and still create a thread, as we are not extending any class. It provides more flexibility in terms of class design.
/*
    Thread Class	    Runnable Interface
    Extends Thread	    Implements Runnable
    Cannot extend       another class	Can extend another class
    Less flexible	    More flexible
    Directly start	    Need Thread object
*/