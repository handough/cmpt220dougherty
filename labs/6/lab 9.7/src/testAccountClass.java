
public class testAccountClass {
	public static void main(String[] args){
		AccountClass account = new AccountClass(1122, 20000, 4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println(account.balance);
		System.out.println(account.monthlyInterest);
		System.out.println(account.annualInterestRate);
		System.out.println(account.monthlyInterestRate);
		System.out.println(account.dateCreated());
	}
}
