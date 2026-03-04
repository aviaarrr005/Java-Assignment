public class ThreadLife {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        });

        System.out.println("State after creation: " + t.getState()); // NEW

        t.start();
        System.out.println("State after start: " + t.getState()); // RUNNABLE (or possibly TIMED_WAITING if it has already started sleeping)

        Thread.sleep(500);
        System.out.println("State during sleep: " + t.getState());      //TimED_WAITING: Thread is sleeping 
 
        t.join();
        System.out.println("State after termination: " + t.getState()); //TERMINATED: Thread has finished execution
    }
}