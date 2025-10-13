package assignment_3;

import java.util.Scanner;


public class credit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		calCredit c1 = new calCredit();
		
		System.out.print("Enter Account Number :");
		c1.setAcountNumberr(sc.nextInt());
		
		System.out.print("Enter Inital Balance :");
		c1.setBalance(sc.nextInt());
		
		System.out.print("Enter items charges  :");
		c1.setItemCharges(sc.nextInt());
		
		System.out.print("Enter credits applied this month : ");
		c1.setCredits(sc.nextInt());
		
		System.out.print("Enter allowed Credits: ");
		c1.setCredits(sc.nextInt());
		
		c1.newBalance();
		
	}

}
