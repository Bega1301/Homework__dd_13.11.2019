public class Main {

    public static void main(String[] args) throws Exception {
        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.getAmount());
        myAccount.deposit(10000);
        System.out.println(myAccount.getAmount());
        myAccount.withDraw(6000);
        System.out.println(myAccount.getAmount());
        while (true) {
            try {

                myAccount.withDraw(1000);
                System.out.println(myAccount.getAmount());

            } catch (Exception ex){
                System.out.println(ex.getMessage());
                break;

            }
        }



    }
}
