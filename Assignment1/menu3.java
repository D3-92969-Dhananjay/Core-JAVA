package assignment_1;
import java.util.*;

public class menu3 {

	public static void main(String[] args) {
		int i = 1;
		int amount = 0;
		
		Scanner sc = new Scanner(System.in);
		String Bill = "";
		
		while(i!=5) {
			
			System.out.println("Menu : ");
			System.out.println("1. Idli : 20 rs");
			System.out.println("2. Dosa : 30 rs");
			System.out.println("3. Poha : 20 rs");
			System.out.println("4. vada pav : 15 rs");
			System.out.println("5. Generate Bill");
			System.out.print("select a option number from Menu : ");	
		
		switch(i) {
		
			case 1: {
								
				i = sc.nextInt();
				Bill += "Idli : 20 rs \n" ;
				amount += 20;
				break;
			}
			case 2: {
				
				i = sc.nextInt();
				Bill += "Dosa : 30 rs \n" ;
				amount += 30 ;
				break;
			}
			case 3: {
				
				i = sc.nextInt();
				Bill += "Poha : 20 rs \n" ;
				amount += 20 ;
				break;
			}
			case 4: {
				
				i = sc.nextInt();
				Bill += "vada pav : 15 rs \n" ;
				amount += 15 ;
				break;
			}
			case 5: {
				i = sc.nextInt();
				break;
			}
		
		}
		}
		System.out.println("--------------------  Your Bill ---------------");
		System.out.println("Item  Price (rs)");
		System.out.println(Bill);
		System.out.println("Total bill : "+ amount);
		System.out.println("-----------------------------------------------");
		
		sc.close();
	}	

}
