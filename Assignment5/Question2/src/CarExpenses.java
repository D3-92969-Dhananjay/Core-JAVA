import java.util.Scanner;

class Employee{
	int milesPerday;
	int costPergasoline;
	int  milage;
	int parkingFees;
	int tollsPerday;
}

public class CarExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		Employee e =  new Employee();
		System.out.print("Total miles driven per day:");
		e.milesPerday =  x.nextInt();
		
		System.out.print("Cost per gallon of gasoline.:");
		e.costPergasoline =  x.nextInt();
		
		System.out.print("Average miles per gallon.:");
		e.milage =  x.nextInt();
		
		System.out.print(" Parking fees per day.:");
		e.parkingFees =  x.nextInt();
		
		System.out.print(" Tolls per day:");
		e.tollsPerday =  x.nextInt();
		
		System.out.println("Your daily driving cost : " +  (((double)e.milesPerday / e.milage) * e.costPergasoline + e.parkingFees + e.tollsPerday));


	}

}
