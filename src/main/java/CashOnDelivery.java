public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount, String currency) {
        super(amount, currency);
    }

    public void processPayment() {
        status = "PAID";
        System.out.println("Cash On Delivery processed");
    }

    public boolean validate() {
        return amount > 0;
    }

}
