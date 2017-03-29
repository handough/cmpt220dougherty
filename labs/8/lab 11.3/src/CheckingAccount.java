
public class CheckingAccount extends Account{
	protected double OVERDRAFT_LIMIT = -100;
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }
    @Override
    public double withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
        return amount;
    }
    @Override
    public String toString() {
        return "CheckingAccount: "+
                "balance = " + balance;
    }
}
