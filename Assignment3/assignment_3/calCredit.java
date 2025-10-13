package assignment_3;

public class calCredit {
	private int acountNumber;
	private int balance;
	private int itemCharges;
	private int credits;
	private int allowedCredits;
	
	public calCredit() {
		
	}

	public int getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumberr(int acount_number) {
		this.acountNumber = acount_number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getItemCharges() {
		return itemCharges;
	}

	public void setItemCharges(int itemCharges) {
		this.itemCharges = itemCharges;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getAllowedCredits() {
		return allowedCredits;
	}

	public void setAllowedCredits(int allowedCredits) {
		this.allowedCredits = allowedCredits;
	}
	
	public void newBalance() {
		int newBal = (this.balance + this.itemCharges - this.credits);
		
		if(newBal > this.credits) {
			System.out.println("Credit limit Exceed");
		}else {
			System.out.println("New Balance : "+newBal);
		}

} }
