public class BankTransfer extends Payment {

    public BankTransfer(double amount, String currency) {
        super(amount, currency);
    }

    public void processPayment() {
        status = "PAID";
        System.out.println("Bank Transfer processed");
    }

    public boolean validate() {
        return amount > 0;
    }

}
