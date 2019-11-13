public class LimitExeption extends Exception {
    double remainingAmount;

    public LimitExeption (String message, double remainingAccount) {
        super(message + " "+ remainingAccount);
        this.remainingAmount=remainingAccount;

    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
