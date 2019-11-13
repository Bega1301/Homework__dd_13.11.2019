public class BankAccount {
    public double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount= sum+amount;

    }

    public void withDraw(double sum) throws Exception{
        if (amount<sum)
            throw new LimitExeption("Недостаточно средств", amount);

        amount-= sum;
    }



}
