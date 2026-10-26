package Ploy;

public class TestPayment {

    public static void main(String[] args) {

        Payment p;

        p = new GooglePay();
        p.pay();

        p = new PhonePe();
        p.pay();

        p = new Paytm();
        p.pay();
    }
}