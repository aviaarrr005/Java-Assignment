class Student {
    String name;
    int age;

    // 1. Default Constructor
    // This is called if we create an object without passing data
    public Student() {
        this.name = "Rohit Sharma";
        this.age = 30;
    }

    // 2. Parameterized Constructor
    // This is called when we want to set specific data immediately
    public Student(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        //Default Constructor
        Student s1 = new Student();
        System.out.print("Student 1 (Default): ");
        s1.display();

        //Parameterized Constructor
        Student s2 = new Student("Virat Kohli", 35);
        System.out.print("Student 2 (Parameterized): ");
        s2.display();
    }
}