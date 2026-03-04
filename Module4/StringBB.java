//Write a program to demonstrate the difference between String, StringBuilder, and
//StringBuffer.

public class StringBB {
    public static void main(String[] args) {
        // Using String
        String str1 = "Hello";
        str1 += " World"; // Creates a new String object 
        System.out.println("String: " + str1);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the same StringBuilder object
        System.out.println("StringBuilder: " + sb.toString());

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World"); // Modifies the same StringBuffer object
        System.out.println("StringBuffer: " + sbf.toString());
    }
}