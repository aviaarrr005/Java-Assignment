public class GC {
    @Override
    public void finalize(){
        System.out.println("Finalize Method, called just before Garbage collection");
    }

    public static void main(String[] args){
        GC ob1 = new GC();
        GC ob2 = new GC();

        ob1=null;
        ob2=null;

        System.out.println("Requesting Garbage Collection.......");
        
        System.gc();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();    //what is this for? Ans: This line is used to print the stack trace of the exception that was caught. It helps in debugging by showing where the exception occurred in the code.
        }

        System.out.println("End");
    }
}