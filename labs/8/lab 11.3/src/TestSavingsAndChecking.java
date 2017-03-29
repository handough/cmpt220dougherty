public class TestSavingsAndChecking {
    public static void main(String[] args) {
        Account account = new Account(000, 000);
        CheckingAccount checkingAccount = new CheckingAccount(000, 000);
        SavingsAccount savingsAccount = new SavingsAccount(000, 000);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }

}
