package Ploy;

public class Test2Bank {

    public static void main(String[] args) {

        BankI b;

        b = new SBI();
        int s1 = b.getRateOfIntrest();
        System.out.println("SBI : " + s1);

        b = new ICICI();
        int s2 = b.getRateOfIntrest();
        System.out.println("ICICI : " + s2);

        b = new HDFC();
        int s3 = b.getRateOfIntrest();
        System.out.println("HDFC : " + s3);
    }
}