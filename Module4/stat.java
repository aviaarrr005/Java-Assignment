//Write a program to demonstrate static variables and static methods
class Count{
    static int globalcnt = 0;
    int cnt = 0;

    Count(){
        globalcnt+=10;
        cnt+=20;
    }

    static void display(){
        System.out.println("Static Method");
    }
}

public class stat{
    public static void main(String[] args){
        Count ob1 = new Count();
        System.out.println("Local variable: "+ ob1.cnt);

        Count ob2 = new Count();
        System.out.println("Static variable: "+ ob2.globalcnt);

        Count.display();
    }
}