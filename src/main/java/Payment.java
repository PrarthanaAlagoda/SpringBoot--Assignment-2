public abstract class Payment implements Payable {

    protected double amount;
    protected String currency;
    protected String status;
    protected String referenceId;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "PENDING";
        this.referenceId = "TXN-1001";
    }

    public abstract void processPayment();

    public void generateReceipt() {
        System.out.println(referenceId + " " + amount + " " + currency);
    }

    public String getReference() {
        return referenceId;
    }

}
