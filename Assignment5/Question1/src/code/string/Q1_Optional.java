package code.string;




import java.util.Scanner;

public class Q1_Optional {
	private int accountNumber;
	private int beginingBalance;
	private int itemCharges;
	private int credits;
	private int limit;
	

	private int newBalance;
	

	public Q1_Optional() {}
	public Q1_Optional(int accountNumber, int beginingBalance, int itemCharges, int credits, int limit) {
		super();
		this.accountNumber = accountNumber;
		this.beginingBalance = beginingBalance;
		this.itemCharges = itemCharges;
		this.credits = credits;
		this.limit = limit;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBeginingBalance(int beginingBalance) {
		this.beginingBalance = beginingBalance;
	}

	public void setItemCharges(int itemCharges) {
		this.itemCharges = itemCharges;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	
	
	public void checkStatus() {
		newBalance = (beginingBalance + itemCharges - credits);
		
		if(newBalance<limit) {
			System.out.println("Credit limit exceeded");
		}else {
			System.out.println("Credit limit  not exceeded");
		}
	}
	
	
	
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		Q1_Optional c1 = new Q1_Optional();
		System.out.print("Enter Account number :");
		c1.setAccountNumber(x.nextInt());
		
		System.out.print("Enter beginning balance :");
		c1.setBeginingBalance(x.nextInt());
		
		System.out.print("Enter charges applied by cutomer this month :");
		c1.setItemCharges(x.nextInt());
		
		System.out.print("Enter credits by cutomer this month :");
		c1.setCredits(x.nextInt());
		
		System.out.print("Enter balance limit :");
		c1.setLimit(x.nextInt());
		
		c1.checkStatus();
		
	}
	
	
	
	

}


