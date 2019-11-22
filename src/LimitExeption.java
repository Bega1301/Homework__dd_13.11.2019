public class LimitExeption extends Exception {
    private double remainingAmount;
    private String message;


    public LimitExeption (String message, double remainingAccount) {
        super(message + " "+ remainingAccount);
        this.remainingAmount=remainingAccount;

    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
