public class BankAccount {
     private double amount;
     private double sum;

     public void setAmmount (double ammount) {
         this.amount= ammount;
     }

    public double getSum() {
        return sum;
    }

    public  void setSum (double sum) {
         this.sum=sum;
    }
    public double getAmount () {
         return amount;
    }

    public double deposit(double sum) {
        amount= sum+amount;
        System.out.println(" Ваш баланс : "+ amount);
        return amount;

    }

    public double withDraw(double sum) throws LimitExeption {
        if (amount<sum){
            throw new LimitExeption("Недостаточно средств", amount);
     }

        amount= amount-sum;
        return amount;
    }



}
