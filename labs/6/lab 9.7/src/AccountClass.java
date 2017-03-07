import java.util.Date;
public class AccountClass {
	private int id;
	double balance;
	double annualInterestRate;
	private Date dateCreated;
	double monthlyInterestRate = 0;
	double monthlyInterest;
	
	public AccountClass(){
		id = 0;
		balance = 0;
		annualInterestRate = 0; 
	}
	public AccountClass(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public AccountClass(int newID, double newBalance, double newAnnualInterestRate){
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	public int getID(int id){
		return id;
	}
	public double getBalance(double balance){
		return balance;
	}
	public double getAnnualInterestRate(double annualInterestRate){
		return annualInterestRate / 100;
	}
	public double getMonthlyInterestRate(){
		monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	public double getMonthlyInterest(){
		monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}
	public double withdraw(double withdraw){
		return balance -= withdraw;
	}
	public double deposit(double deposit){
		return balance += deposit;
	}
	public void setDateCreated(Date newDateCreated){
		dateCreated = newDateCreated;
	}
	Date dateCreated(){
		return dateCreated;
	}
}
