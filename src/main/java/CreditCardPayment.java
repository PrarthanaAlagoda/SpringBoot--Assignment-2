public class CreditCardPayment extends CardPayment implements Discount {

    private double discountedAmount;

    public CreditCardPayment(double amount, String currency,
                             String cardNumber, String holder, String expiry) {

        super(amount, currency, cardNumber, holder, expiry);
    }

    public void processPayment() {
        status = "PAID";
        System.out.println("Credit Card payment processed");
    }

    public double applyDiscount(double percent) {
        discountedAmount = amount * (1 - percent / 100);
        return discountedAmount;
    }

    public double finalAmount() {
        return discountedAmount;
    }

}
