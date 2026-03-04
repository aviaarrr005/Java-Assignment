//Create an interface Payment with method pay(). Implement it in CreditCardPayment
//and UPIPayment classes.

interface Payment{
    void pay();
}

class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

class UPIPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

public class interfaceEx {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay();
        p2.pay();
    }
}