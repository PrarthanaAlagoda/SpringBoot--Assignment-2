public class Main {

    public static void main(String[] args) {

        Payment p1 = new CashOnDelivery(5000, "LKR");
        p1.processPayment();

        Payment p2 = new BankTransfer(8000, "LKR");
        p2.processPayment();

        CreditCardPayment c1 =
                new CreditCardPayment(10000,"LKR","1234","John","12/28");

        c1.applyDiscount(10);
        c1.processPayment();

        System.out.println("Final Amount: " + c1.finalAmount());

    }

}