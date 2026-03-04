//Write a program using try-catch-finally to handle division by zero.

public class tryy{
    public static void main(String[] args){
        int a = 10;

        try{
            int div = a/0;
        }catch(ArithmeticException e){
            System.out.println("Exception caught: "+e.getMessage());
        }

        finally{
            System.out.println("Finally Method, excutes anyway");
        }
    }
}