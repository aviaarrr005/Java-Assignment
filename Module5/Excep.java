// Write a program to demonstrate checked and unchecked exceptions with examples.
import java.io.*;
public class Excep{

    void display() throws IOException {
        FileReader file = new FileReader("abc.txt");
    }

    public static void main(String[] args){

        //Unchecked
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Exception caught(Unchecked): "+e.getMessage());
        }

        //checked
        Excep ob = new Excep();
        try{
            ob.display();
        }catch(IOException n){
            System.out.println("Exception Caught(Checked): "+n.getMessage());    
        }
    }
}
