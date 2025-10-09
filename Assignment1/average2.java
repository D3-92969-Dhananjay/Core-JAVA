package assignment_1;
import java.util.*;


public class average2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		
		System.out.print("Enter 1st number : ");
		Double i = sc.nextDouble();		
		System.out.print("Enter 2nd number : ");
		Double j = sc.nextDouble();		
		
		
		Double avg = (i+j)/2;
		System.out.println("Avgerage of 2 numbers is "+avg);
			
		}catch(Exception e) {
			System.out.println("Entered values are not double value");
		}
		sc.close();
	}

}
