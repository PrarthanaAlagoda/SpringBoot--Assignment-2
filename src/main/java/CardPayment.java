public abstract class CardPayment extends Payment {

    protected String cardNumber;
    protected String holder;
    protected String expiry;

    public CardPayment(double amount, String currency,
                       String cardNumber, String holder, String expiry) {

        super(amount, currency);
        this.cardNumber = cardNumber;
        this.holder = holder;
        this.expiry = expiry;
    }

    public boolean validate() {
        return cardNumber != null && expiry != null;
    }

}